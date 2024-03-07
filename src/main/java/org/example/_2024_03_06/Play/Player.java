package org.example._2024_03_06.Play;


import java.util.List;
import java.util.concurrent.Exchanger;

public class Player extends Thread {

    private String name;
    private Exchanger<Action> exchanger;
    private List<Action> actionList;

    public Player(String name, Exchanger<Action> exchanger, List<Action> actionList) {
        this.name = name;
        this.exchanger = exchanger;
        this.actionList = actionList;
        this.start();

}



    private void getWinner(Action person1, Action person2) { //(Action person1, Action person2)
        if (person1 == Action.PAPER && person2 == Action.STONE ||
                person1 == Action.SCISSORS && person2 == Action.PAPER ||
                person1 == Action.STONE && person2 == Action.SCISSORS) {
            System.out.println("*** Winner: " + name + " ***");
        }
    }

    @Override
    public void run() {
        Action get;
        for (Action action :
                actionList) {
            try {
                Thread.sleep(111);
                get = exchanger.exchange(action);
                getWinner(action, get);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
