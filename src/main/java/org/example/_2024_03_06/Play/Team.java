package org.example._2024_03_06.Play;


import com.github.javafaker.Faker;

import java.util.*;
import java.util.concurrent.Exchanger;

public class Team {

    private static final Faker FAKER = new Faker();
    private static final Exchanger<Action> EXCHANGER = new Exchanger<>();
    private static final Random RANDOM = new Random();

    private static Set<Player> playerSet = new HashSet<>();

    public static Set<Player> playerCreator(Team team) {

        for (int i = 0; i < 3; i++) {
            playerSet.add(new Player(FAKER.funnyName().name(), EXCHANGER, getListAction()));
        }
        return playerSet;
    }
    static List<Action> getListAction() {
        List<Action> actionList = new ArrayList<>();
        Action[] actions = Action.values();

        for (int i = 0; i < playerSet.size(); i++) {
            actionList.add(actions[RANDOM.nextInt(actions.length)]);
        }
        return actionList;
    }


}
