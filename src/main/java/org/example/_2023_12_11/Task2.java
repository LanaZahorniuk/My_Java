package org.example._2023_12_11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task2 {


    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("Hallo", "Java");
        map.put("Hi", "Lana");
        //printMap(map);


        Set<String> set = new HashSet<>();
        set.add("Hallo");
        set.add("Hi");
        findKeysByValue(map, "Lana");


    }

    //void printMap(Map<String, String> map) { } Вывести все ключи и значения
    public static void printMap(Map<String, String> map) {
        System.out.println(map.entrySet());
    }


    /*
    Set<String> findKeysByValue(Map<String, String> map, String value) {
} Найти ключи, значения которых равны заданной строке.
     */
    public static Set<String> findKeysByValue(Map<String, String> map, String value) {
        if (map.containsKey(value)) {
            System.out.println(map.get(value) + " - " + "with key = " + value);
        }
        return Set.of(map.get(value));
    }
}
/*
public static Set<String> findKeysByValue(Map<String, String> map, String value) {
        if (map.containsKey(value)){
            System.out.println(map.get(value) + " - " + "with key = " + value);
        }
        return Set.of(map.get(value));
    }
 */