package org.example._2023_11_27;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        Integer [] array = {1,1,1,2,2,3,4,5,5,5,6,7,8,8,9,10};

        Map<Integer,Integer> count = new HashMap<>();

        for (Integer e: array) {
            count.put(e,count.getOrDefault(e,0)+1);
        }

        for(Map.Entry<Integer,Integer> e : count.entrySet()) {
            System.out.println("Значение:" + e.getKey() + ", " + "повтор:" + e.getValue());
        }
    }
}

/*
- Дан массив/коллекция целых чисел. Необходимо подсчитать, сколько раз каждый элемент встречается в массив/коллекции.
 */
