package org.example._2023_11_27;

import java.util.*;

public class Task {
    public static void main(String[] args) {
        int [] array = {1,4,2,3,5,6,8,7,9,10};
        getSum(array, 5);

        List<Integer> list = new ArrayList<>(Arrays.asList(1,4,2,3,5,6,8,7,9,10));
        getSumList(list, 5);
    }

    public static void getSum(int[] arr, int sum) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int start = 0;
        int end = arr.length - 1;
        while (start != end) {
            if (arr[start] + arr[end] == sum) {
                System.out.println("индексы: " + start + " ," + end);
                end --;
            } else if (arr[start] + arr[end] > sum) {
                end--;
            } else {
                start ++;
            }
        }
    }

    public static void getSumList (List<Integer> list, int sum) {
        Collections.sort(list);
        System.out.println(list);
        int start = 0;
        int end = list.size() -1;
        while (start != end) {
            if (list.get(start)+ list.get(end) == sum) {
                System.out.println("индексы: " + start + " ," + end);
                end --;
            } else if (list.get(start)+ list.get(end) > sum) {
                end--;
            } else {
                start ++;
            }
        }
    }
}


/*
- Дан массив/коллекция целых чисел и целое число X. Найти пару чисел в массиве/коллекции, сумма которых равна X.

 */
