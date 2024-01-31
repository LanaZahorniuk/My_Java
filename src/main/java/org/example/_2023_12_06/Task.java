package org.example._2023_12_06;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task {


    public static void main(String[] args) {
        Map<String, Integer> nameAge = new HashMap<>();

        nameAge.put("Lana", 34);
        nameAge.put("Tom", 24);
        nameAge.put("Jana", 12);

        doubleAge(nameAge);

        Map<Integer, String> user = new HashMap<>();
        user.put(99, "Lana");
        user.put(101, "Tom");
        user.put(105, "Jana");


    }

    /*
    **Создайте HashMap<String, Integer>, заполните его парами
"имя-возраст". Используйте цикл for-each для удвоения возраста каждого человека.
     */

    public static void doubleAge(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> age : map.entrySet()) {
            System.out.println(age.getValue() * 2);
        }}
    }


     /*
    ***Создайте HashMap<Integer, String>, представляющий
"ID-имя пользователя". Используйте цикл для фильтрации
пользователей с ID больше 100 и копируйте их в TreeMap.


    public static void filterId(Map<Integer, String> map) {
        Map<Integer, String> treeMap = new TreeMap<>();

        for (Integer fl : map.keySet()) {
            int k = treeMap.keySet();
            if (fl > 100) {
                treeMap.put(fl);
            }
        }
    }
}    */
