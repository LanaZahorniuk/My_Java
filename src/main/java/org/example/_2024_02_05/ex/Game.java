package org.example._2024_02_05.ex;//package main.java.org.example._2023_12_20.ex;
//
//import com.github.javafaker.Faker;
//
//public class Game {
//    private static final Faker FAKER = new Faker();
//
//    public static void main(String[] args) {
//        Pupil p1 = new Pupil(FAKER.name().name(), 8);
//        Pupil p2 = new Pupil(FAKER.name().name(), 9);
//
//        Teenager t1 = new Teenager(FAKER.name().name(), 12);
//        Teenager t2 = new Teenager(FAKER.name().name(), 13);
//
//        Adult a1 = new Adult(FAKER.name().name(), 25);
//        Adult a2 = new Adult(FAKER.name().name(), 27);
//
//        Team<Pupil> pt1 = new Team<>(FAKER.team().name());
//        Team<Pupil> pt2 = new Team<>(FAKER.team().name());
//        Team<Teenager> tt1 = new Team<>(FAKER.team().name());
//        Team<Teenager> tt2 = new Team<>(FAKER.team().name());
//        Team<Adult> at1 = new Team<>(FAKER.team().name());
//        Team<Adult> at2 = new Team<>(FAKER.team().name());
//
//        pt1.addNewParticipant(p1);
//        pt2.addNewParticipant(p2);
//
//        tt1.addNewParticipant(t1);
//        tt2.addNewParticipant(t2);
//
//        at1.addNewParticipant(a1);
//        at2.addNewParticipant(a2);
//
//        tt1.play(tt2);
//    }
//}