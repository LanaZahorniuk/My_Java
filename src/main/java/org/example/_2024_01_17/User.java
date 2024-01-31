package org.example._2024_01_17;

import java.util.Arrays;
import java.util.List;

/*
   Задача 2: Напишите метод, который преобразует список объектов с вложенными списками в один список всех вложенных элементов.
class User {
   private String name;
   private List<String> skills;
}
    */

public class User {
    public static void main(String[] args) {
        List<User> listUser = Arrays.asList(
                new User("Lana", Arrays.asList("Lana", "Lara")),
                new User("Tom", Arrays.asList("Tom", "Sara")),
                new User("Artur", Arrays.asList("Artur", "Lara"))

        );

        System.out.println(getList(listUser));
    }



    public static List<String> getList(List<User> listUser) {
        return listUser.stream()
                .flatMap(l -> l.getSkills().stream())
                .toList();

    }
// public List<String> getAllSkills(List<User> users) {
//}
    private String name;
    private List<String> skills;

    public String getName() {
        return name;
    }

    public List<String> getSkills() {
        return skills;
    }

    public User(String name, List<String> skills) {
        this.name = name;
        this.skills = skills;
    }
}
