package org.example._2024_01_15;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task {
    public static void main(String[] args) {

        Stream<String> names = Stream.of("Alice", "Bob", "Charlie", "David");
        List<String> names2 = getList(names);

        List<String> strings = Arrays.asList("Alice", "Bob", "Charlie", "Davidavidavidavid", "David", "David");
        String String = new String("Charlie");
        List<Integer> Inte = Arrays.asList(12, 40, 1, 10);

        System.out.println(getSet(strings));
        System.out.println(getSizeString(strings));
        System.out.println(getDouple(strings));
        System.out.println(getUnique(strings));
        System.out.println(getMaxString(strings));
        System.out.println(getStringFromChar(String));
        System.out.println(getCustomCollection(Inte));


    }


    // Задача 1: Собрать элементы потока в список.
    public static <T> List<T> getList(Stream<T> stream) {
        return stream
                .collect(Collectors.toList());
    }

    // Задача 2: Удалить дубликаты из списка и собрать их в множество.
    public static <T> Set<T> getSet(List<T> list) {
        return list.stream()
                .collect(Collectors.toSet());
    }

    // Задача 3: Группировка строк по длине.
    public static Map<Integer, List<String>> getSizeString(List<String> strings) {
        return strings.stream()
                .collect(Collectors.groupingBy(String::length));
    }

    // Задача 4: Подсчет повторяющихся элементов и создание мапа.
    public static Map<String, Long> getDouple(List<String> strings) {
        return strings.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
    }

    // Задача 5: Собрать только уникальные элементы в список.
    public static List<String> getUnique(List<String> strings) {
        return strings.stream()
                .collect(Collectors.collectingAndThen(Collectors.toSet(), ArrayList::new));
    }

    // Задача 6: Объединение элементов в строку с максимальной длиной (вывести максимальную длину строки).
    public static Optional<String> getMaxString(List<String> strings) {
        return strings.stream()
                .max(Comparator.comparingInt(String::length));
    }

    // Задача 7: Разбиение строки на символы и сбор их в множество.
    public static Set<Character> getStringFromChar(String string) {
        return string.chars()
                .mapToObj(c -> (char) c).collect(Collectors.toSet());
    }

    // Задача 8: Построение кастомной мапы из элементов.
    public static Map<String, Integer> getCustomCollection(List<Integer> integerList) {
        return integerList.stream()
                .collect(Collectors.toMap(e -> "key" + e, e -> e * 2));
    }

    // Задача 9: Подсчет суммы значений объектов.
    public static Integer getSumValues(List<Person> people) {
        return people.stream()
                .collect(Collectors.summingInt(p -> p.getAge()));



    }
    // Задача 10: Группировка по критерию и подсчет среднего.
//    static Map<Double, String> groupByAges(List<Person> personList) {
//        return personList.stream()
//                .collect(Collectors.groupingBy(Collectors.averagingInt(Person::getAge), Person::getName));
//    }


    /*


    // 7. Подсчет суммы значений объектов
        int totalAge = Stream.of(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35))
                .collect(Collectors.summingInt(Person::getAge));
        System.out.println("Total age: " + totalAge);

        // 8. Группировка по критерию и подсчет среднего
        Map<String, Double> averageAgeByName = Stream.of(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Alice", 35),
                new Person("Charlie", 40))
                .collect(Collectors.groupingBy(Person::getName, Collectors.averagingInt(Person::getAge)));
        System.out.println("Average age by name: " + averageAgeByName);

     */


    // Задача 10: Группировка по критерию и подсчет среднего.

}
