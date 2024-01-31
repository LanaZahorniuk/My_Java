package org.example._2024_01_17;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task {


    public static void main(String[] args) {

        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6),
                Arrays.asList(7, 8),
                Arrays.asList(9, 10)
        );

        System.out.println(flattenListOfLists(listOfLists));

        Map<String, List<String>> map = new HashMap<>();
        map.put("Собака", Arrays.asList("Зубы", "Хвост"));
        map.put("Кошка", Arrays.asList("Когти", "Зрачки"));
        map.put("Корова", Arrays.asList("Рога", "Молоко"));
        map.put("Лошадь", Arrays.asList("Копыта", "Мощь"));

        System.out.println(flattenMap(map));


        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6),
                Arrays.asList(7, 8),
                Arrays.asList(9, 10)
        );

        System.out.println(processAndFilter(list));


        List<List<List<Integer>>> listListList = Arrays.asList(Arrays.asList(
                        Arrays.asList(1, 2),
                        Arrays.asList(3, 4),
                        Arrays.asList(5, 6),
                        Arrays.asList(7, 8),
                        Arrays.asList(9, 10)),

                (Arrays.asList(
                        Arrays.asList(11, 12),
                        Arrays.asList(13, 14),
                        Arrays.asList(15, 16),
                        Arrays.asList(17, 18),
                        Arrays.asList(19, 20))));

        System.out.println(flattenDeepListOfLists(listListList));

    }

    /*
       Задача 1: Напишите метод, который принимает список списков целых чисел
   и преобразует его в один список
        */
    public static List<Integer> flattenListOfLists(List<List<Integer>> listOfLists) {
        return listOfLists.stream()
                .flatMap(Collection::stream) //.flatMap(el -> el.stream())
                .toList();
    }


    /*
    Задача 4: Напишите метод, который преобразует Map в список значений.
     */
    public static List<String> flattenMap(Map<String, List<String>> map) {
        return map.entrySet().stream()
                .flatMap(el -> el.getValue().stream())
                .toList();
    }

    /*
    Задача 5: Напишите метод, который принимает список списков и фильтрует все четные числа, а затем умножает их на 2.
     */
    public static List<Integer> processAndFilter(List<List<Integer>> listOfLists) {
        return listOfLists.stream()
                .flatMap(el -> el.stream())
                .filter(el -> el % 2 == 0)
                .map(el -> el * 2)
                .toList();
    }

    /*
    Задача 7: Напишите метод, который принимает список списков списков чисел и преобразует его в один список чисел.
     */
    public static List<Integer> flattenDeepListOfLists(List<List<List<Integer>>> deepList) {
    return deepList.stream()
            .flatMap(el ->el.stream())
            .flatMap(el -> el.stream())
            .toList();
    }

    /*
    Задача 10: Напишите метод, который объединяет данные из нескольких списков и
преобразует их в один список, применяя к каждому элементу определённую функцию.

 public static List<String> combineAndTransform(List<Integer> list1, List<Double> list2, Function<Number, String> transformer) {

    }
     */



}
