package org.example._2024_02_05.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<P extends Participant> {
    private String name;
    private List<P> participants  = new ArrayList<>(100);

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addNewParticipant(P newParticipant) {
        participants.add(newParticipant);
    }

    public void play(Team<P> teamPlayWith) {
        String winner;
        Random random = new Random();
        int i = random.nextInt(2);
        if(i == 1) {
            winner = this.name;
        } else {
            winner = teamPlayWith.name;
        }

        System.out.println("*****Winner is: " + winner + "*****");
    }
}