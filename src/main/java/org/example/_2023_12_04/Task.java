package org.example._2023_12_04;

import com.github.javafaker.Faker;

import java.util.*;

public class Task {
    private static final Faker FAKER = new Faker();

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Hello", "Privet");
        map.put("Welcome", "By");
        map.put("Try", "Did");
        map.put("Choose", "Weather");
        map.put("Can", "answer");
        map.put("quality", "Bad");
        // List<String> list = new LinkedList<>();

        // HashMap<String, String>: Найдите количество пар ключ-значение, где длина ключа равна длине значения.
        for (Map.Entry<String, String> k :
                map.entrySet()) {
            if (k.getKey().length() == k.getValue().length()) {
                System.out.println(k.getKey() + " - " + k.getValue());
            }
        }
        int count = 0;
        Map<String, Integer> sum = new HashMap<>();
        sum.put("Hello", 1);
        sum.put("Welcome", 2);
        sum.put("Try", 3);
        sum.put("Choose", 4);
        sum.put("Can", 5);
        sum.put("quality", 6);

        // HashMap<String, Integer>: Подсчитайте сумму всех значений, соответствующих ключам, начинающимся на букву 'A'.
        for (Map.Entry<String, Integer> e :
                sum.entrySet()) {
            if (e.getKey().startsWith("C")) {
                count += e.getValue();
            }
        }
        System.out.println(count);


        Map<Integer, List<String>> str = new HashMap<>();
        str.put(1, new ArrayList<>(Arrays.asList("hallo", "moin", "Lana", "Apfel")));
        str.put(2, new ArrayList<>(Arrays.asList("ballo", "noin", "Sana", "zpfel")));
        str.put(3, new ArrayList<>(Arrays.asList("aaallo", "koin", "Fana", "ppfel")));

        // HashMap<Integer, List<String>>: Для каждого ключа выведите все строки из соответствующего списка, которые начинаются с гласной буквы.
        for (Map.Entry<Integer, List<String>> list : str.entrySet()) {
            for (String s : list.getValue()) {
                if (checkStart(s)) {
                    System.out.println(s);
                }
            }
        }


        Map<Integer, Integer> max = new HashMap<>();
        max.put(1, 10);
        max.put(2, 6_000);
        max.put(3, 350);
        max.put(4, 14);
        max.put(5, 55);
        max.put(6, 200);

        // HashMap<Integer, Integer>: Найдите ключ с максимальным значением и выведите эту пару.
        maxNumber(max);

        Map<String, String> mapmap = new HashMap<>();
        mapmap.put("hello", "olleh");
        mapmap.put("by", "yb");
        mapmap.put("Try", "Did");
        mapmap.put("Choose", "Weather");
        mapmap.put("Can", "answer");
        mapmap.put("quality", "Bad");
    }

    static public boolean checkStart(String string) {
        List<Character> abc = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        if (abc.contains(string.charAt(0))) {
            return true;
        }
        return false;
    }

    static public void maxNumber(Map<Integer, Integer> max) {
        int maxKey = 0;
        int maxValue = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> setNum : max.entrySet()) {
            if (maxValue < setNum.getValue()) {
                maxKey=setNum.getKey();
                maxValue= setNum.getValue();
            }
        }
        System.out.println("value " + maxValue + " - " + maxKey + " key");
    }

    // HashMap<String, String>: Определите, содержит ли HashMap такую пару ключ-значение, где ключ является обратной строкой значения (например, ключ "abc", значение "cba").
    static void checkRevers  (Map<String, String> map) {
        for (Map.Entry<String, String> element:map.entrySet()) {

        }
    }

    // HashMap<String, Integer>: Переберите HashMap и преобразуйте его в HashMap<String, String>, где каждое значение - это строковое представление исходного числа, умноженного на 2.


}

/*
static void checkReverse(Map<String, String> map) {
        for(Map.Entry<String, String> element : map.entrySet()) {
            if(isPalindrome(element.getKey(), element.getValue())) {
                System.out.println("Palindrome - KEY: " + element.getKey() + " VALUE: " + element.getValue());
            }
        }
    }

    static boolean isPalindrome(String first, String second) {
        if(first.length() != second.length()) {
            return  false;
        }

        char[] firstChar = first.toCharArray();
        char[] secondChar = second.toCharArray();

        for (int i = 0; i < firstChar.length; i++) {
            if(firstChar[i] != secondChar[firstChar.length - i - 1]) {
                return false;
            }
        }

        return true;
    }
 */
