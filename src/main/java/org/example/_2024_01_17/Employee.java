package org.example._2024_01_17;

import java.util.Arrays;
import java.util.List;

public class Employee {
    /*
    Задача 6: Преобразование и фильтрация объектов в списках
Задание: Напишите метод, который фильтрует список объектов по некоторому условию,
а затем извлекает и объединяет определённые атрибуты этих объектов в один список.
class Employee {
    private String department;
    private List<String> languages;
}
     */

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("BackEnd", Arrays.asList("Java", "Kotlin")),
                new Employee("BackEnd", Arrays.asList("PhP", "Ruby")),
                new Employee("BackEnd", Arrays.asList("C++", "C#")),
                new Employee("FrontEnd", Arrays.asList("JS", "CSS")),
                new Employee("QA", Arrays.asList("Java", "SomeLanguages"))
        );

        System.out.println(getLanguagesFromDepartment(employees, "BackEnd"));
    }

    public static List<String> getLanguagesFromDepartment(List<Employee> employees, String department) {
    return employees.stream()
            .filter(el -> el.getDepartment().equals(department))
            .flatMap(el -> el.getLanguages().stream())
            .toList();
    }

    private String department;
    private List<String> languages;

    public Employee(String department, List<String> languages) {
        this.department = department;
        this.languages = languages;
    }

    public String getDepartment() {
        return department;
    }

    public List<String> getLanguages() {
        return languages;
    }
}
