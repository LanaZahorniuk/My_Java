package org.example._2024_01_10;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskStream {
    //1. Задача: Фильтрация списка строк по длине.
    //Сигнатура: List<String> filterByLength(List<String> input, int length);
    public static List<String> filterByLength(List<String> input, int length) {
        return input.stream()
                .filter(el -> el.length() == length)
                .toList();
    }

    //2. Задача: Преобразование всех строк в верхний регистр.
    //Сигнатура: List<String> toUpperCase(List<String> input);

    public static List<String> toUpperCase(List<String> input) {
        return input.stream()
                .map(String::toUpperCase)
                .toList();
    }

    //3. Задача: Поиск первой строки, начинающейся на заданную букву.
    //Сигнатура: Optional<String> findFirstStartingWith(List<String> input, char letter);
    public static Optional<String> findFirstStartingWith(List<String> input, char letter) {
        return input.stream()
                .filter(el -> el.startsWith(String.valueOf(letter)))
                .findFirst();
    }

    //4. Задача: Соединение строк через запятую.
    //Сигнатура: String joinByComma(List<String> input);

    public static String joinByComma(List<String> input) {
        return String.join(", ", input);
    }

    //5. Задача: Подсчёт количества строк, содержащих заданный символ.
    //Сигнатура: long countContainingChar(List<String> input, char ch);
    public static long countContainingChar(List<String> input, char ch) {
        return input.stream()
                .filter(el -> el.indexOf(ch) != -1)
                .count();
    }

    /*
    //6. Задача: Найти сумму всех чисел в списке.
//Сигнатура: int sumOfList(List<Integer> input);
    public static int sumOfList(List<Integer> input){
        return input.stream()
                .mapToInt(Integer::intValue)
                .sum();

    //    7. Задача: Получить список квадратов чисел.
//Сигнатура: List<Integer> getSquares(List<Integer> input);
    public static List<Integer> getSquares(List<Integer> input){
        return input.stream()
                .map(el -> el * el)
                .toList();
    }

//    Задача: Фильтрация чисел, больших заданного значения.
//Сигнатура: List<Integer> filterGreaterThan(List<Integer> input, int minValue);
    public static List<Integer> filterGreaterThan(List<Integer> input, int minValue){
        return input.stream()
                .filter(el -> el > minValue)
                .toList();
    }

//    9. Задача: Проверка, содержит ли список заданное число.
//Сигнатура: boolean containsNumber(List<Integer> input, int number);
    public static boolean containsNumber(List<Integer> input, int number){
        return input.contains(number);
    }
     */

    //10. Задача: Найти максимальное число в списке.
    //Сигнатура: Optional<Integer> findMax(List<Integer> input);

    public static Optional<Integer> findMax(List<Integer> input) {
        return input.stream()
                .max(Integer::compareTo);
    }

    //11. Задача: Преобразование списка символов в список строк.
    //Сигнатура: List<String> convertToStringList(List<Character> input);
    public static List<String> convertToStringList(List<Character> input) {
        return input.stream()
                .map(String::valueOf)
                .toList();
    }

    //12. Задача: Фильтрация символов по ASCII-значению.
    //Сигнатура: List<Character> filterByAsciiValue(List<Character> input, int ascii);

    public static List<Character> filterByAsciiValue(List<Character> input, int ascii) {
        return input.stream()
                .filter(el -> el == ascii)
                .toList();
    }

    //13. Задача: Проверка, все ли символы в списке заглавные.
    //Сигнатура: boolean areAllUpperCase(List<Character> input);

    public static boolean areAllUpperCase(List<Character> input) {
        return input.stream()
                .allMatch(el -> Character.isUpperCase(el));
    }

    //14. Задача: Найти первый повторяющийся символ.
    //Сигнатура: Optional<Character> findFirstDuplicate(List<Character> input);
    public static Optional<Character> findFirstDuplicate(List<Character> input) {
        Set<Character> characters = new HashSet<>();
        return input.stream()
                .filter(ch -> !characters.add(ch))
                .findFirst();
    }

    //15. Задача: Получить обратный список символов.
    //Сигнатура: List<Character> reverseList(List<Character> input);

    public static List<Character> reverseList(List<Character> input) {
        //Collections.reverse(input);
        //return input;
        return input.stream()
                .collect(Collectors.collectingAndThen(Collectors.toList(), result -> {
                    Collections.reverse(result);
                    return result;
                }));

    }
}
