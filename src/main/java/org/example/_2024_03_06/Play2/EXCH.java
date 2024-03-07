package org.example._2024_03_06.Play2;

import com.github.javafaker.Faker;

import java.util.*;
import java.util.concurrent.Exchanger;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class EXCH {
    private static final Exchanger<Action> EXCHANGER = new Exchanger<>();
    private static final Exchanger<Player> EXCHANGERPLAYER = new Exchanger<>();
    private static final Faker FAKER = new Faker();
    private static final Random RANDOM = new Random();


    static List<Team> generatorTeam(int quantityTeams, int quantityPlayers) {
        return Stream.generate(() -> new Team(FAKER.team().name(), generatorPlayer(quantityPlayers), EXCHANGERPLAYER))
                .limit(quantityTeams)
                .toList();
    }

    static Set<Player> generatorPlayer(int quantityPlayers) {
        return Stream.generate(() -> new Player(FAKER.funnyName().name(), EXCHANGER, getListAction()))
                .limit(quantityPlayers)
                .collect(Collectors.toSet());
    }

    static List<Action> getListAction() {
        List<Action> actionList = new ArrayList<>();
        Action[] actions = Action.values();

        for (int i = 0; i < 3; i++) {
            actionList.add(actions[RANDOM.nextInt(actions.length)]);
        }
        return actionList;
    }

    static Set<Player> getListPlayers() {
        Set<Player> playerSet = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            playerSet.add(new Player(FAKER.funnyName().name(), EXCHANGER, getListAction()));
        }
        return playerSet;
    }

    public static void main(String[] args) {

//        new Player(FAKER.funnyName().name(), EXCHANGER, getListAction());
//        new Player(FAKER.funnyName().name(), EXCHANGER, getListAction());

        //new Team(FAKER.team().name(), getListPlayers(), EXCHANGERPLAYER).start();
        // new Team(FAKER.team().name(), getListPlayers(), EXCHANGERPLAYER).start();
        List<Team> teams = generatorTeam(10, 3);
        System.out.println(teams);

    }
}

enum Action {
    SCISSORS,
    STONE,
    PAPER
}

class Player extends Thread {
    private String name;
    private Exchanger<Action> exchanger;
    private List<Action> actionList;

    private double points = 0.0;

    public Player(String name, Exchanger<Action> exchanger, List<Action> actionList) {
        this.name = name;
        this.exchanger = exchanger;
        this.actionList = actionList;
    }

    public void getWinner(Action p1, Action p2) {
        if (p1 == Action.PAPER && p2 == Action.STONE ||
                p1 == Action.SCISSORS && p2 == Action.PAPER ||
                p1 == Action.STONE && p2 == Action.SCISSORS) {
            //System.out.println("*** WINNER: " + name + " ***");
            this.points += 1.0;
        } else if (p1 == Action.PAPER && p2 == Action.PAPER ||
                p1 == Action.SCISSORS && p2 == Action.SCISSORS ||
                p1 == Action.STONE && p2 == Action.STONE) {
            //System.out.println("*** DRAW: " + name + " ***");
            this.points += 0.5;
        }
    }

    @Override
    public void run() {
        Action get;
        for (Action action : actionList) {
            try {
                //Thread.sleep(1234);
                get = exchanger.exchange(action);
                getWinner(action, get);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public String toString() {
        return "Player name - " + name + ", points=" + points;
    }
}

class Team extends Thread {
    private String nameTeam;
    private Set<Player> players;
    private Exchanger<Player> exchanger;

    private double points = 0.0;

    public Team(String nameTeam, Set<Player> players, Exchanger<Player> exchanger) {
        this.nameTeam = nameTeam;
        this.players = players;
        this.exchanger = exchanger;
    }

    public void makeGamy(Player player1, Player player2) throws InterruptedException {
        synchronized (this) {
            while (players.size() < 2) {
                this.wait();
            }
        }
        for (int i = 0; i < players.size(); i++) {
            player1.run();
            player2.run();
        }
    }

    @Override
    public void run() {
        Player get;
        for (Player player : players) {
            try {
                //Thread.sleep(1234);
                get = exchanger.exchange(player);
                makeGamy(player, get);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public double makeScoring() {
        return players.stream()
                .map(player -> points)
                .reduce(Double::sum)
                .orElse(0.0);
    }

    @Override
    public String toString() {
        return '\n'+"Team - " + nameTeam + ", points " + points;
    }
}




