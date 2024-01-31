package org.example._2023_12_18;

import java.util.Arrays;

/*
Создайте функциональный интерфейс ArrayTransformer с методом transform, который принимает массив
целых чисел и выполняет операцию возведения каждого элемента в квадрат.
Напишите метод, который принимает массив и ArrayTransformer, и изменяет массив, возведя каждый его элемент в квадрат.
*/
public class Task6 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5};
        arr = Arrays.stream(arr)
                .map(el -> el * el)
                .toArray();

        for (int a :
                arr) {
            System.out.println(a);
        }
    }

    public static void isExponentiation(ArrayTransformer arrayTransformer, int[] array) {
        arrayTransformer.transform(array);
    }
}


interface ArrayTransformer {
    void transform(int[] array);
}