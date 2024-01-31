package org.example._2024_01_17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Project {
    /*
    Задача 8: Напишите метод, который принимает список объектов с вложенными коллекциями,
сортирует вложенные элементы и возвращает отсортированный список всех элементов.
class Project {
    private String name;
    private List<String> tasks;
}
     */
    public static void main(String[] args) {

        List<Project> projects = new ArrayList<>();
        projects.add(new Project("CW Projekt", Arrays.asList("Work", "CashOut")));
        projects.add(new Project("Discord", Arrays.asList("Call", "Talk")));
        projects.add(new Project("TelRan", Arrays.asList("Learn", "WorkTogether")));

        System.out.println(getSortedTasks(projects));
    }


    public static List<String> getSortedTasks(List<Project> projects) {
        return projects.stream()
                .flatMap(el -> el.getTasks().stream())
                .sorted()
                .toList();
    }

    private String name;
    private List<String> tasks;

    public Project(String name, List<String> tasks) {
        this.name = name;
        this.tasks = tasks;
    }

    public String getName() {
        return name;
    }

    public List<String> getTasks() {
        return tasks;
    }
}
