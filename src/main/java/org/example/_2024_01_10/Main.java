package org.example._2024_01_10;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Lana", "Tom", "Artur", "Linda", "Sara");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Character> characters = Arrays.asList('a', 'b', 'c', 'd', 'a', 'b');
        List<Character> characters2 = Arrays.asList('A', 'B', 'C');


        System.out.println(TaskStream.filterByLength(strings, 3));
        System.out.println(TaskStream.toUpperCase(strings));
        System.out.println(TaskStream.findFirstStartingWith(strings, 'L'));
        System.out.println(TaskStream.joinByComma(strings));
        System.out.println(TaskStream.countContainingChar(strings, 'a'));
        System.out.println(TaskStream.findMax(numbers));
        System.out.println(TaskStream.convertToStringList(characters));
        System.out.println(TaskStream.filterByAsciiValue(characters, 97));
        System.out.println(TaskStream.areAllUpperCase(characters));
        System.out.println(TaskStream.areAllUpperCase(characters2));
        System.out.println(TaskStream.findFirstDuplicate(characters));
        System.out.println(TaskStream.reverseList(characters));
    }
}
