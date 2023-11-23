package org.example._2023_11_20;

public class Task3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 4, 3, 2, 1};
        int[] arr3 = {1, 3, 2, 4, 5};
        System.out.println(isMonotonic(arr1));
        System.out.println(isMonotonic(arr2));
        System.out.println(isMonotonic(arr3));

        isMonotonicAnother(arr1);
        isMonotonicAnother(arr2);
        isMonotonicAnother(arr3);

    }

    // Метод для проверки монотонности массива
    public static boolean isMonotonic (int[] array) {
        boolean increasing = true;
        boolean decreasing = true;
        // Проверяем, является ли массив возрастающим
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                increasing = false;
                break;
            }
        }
        // Проверяем, является ли массив убывающим
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] < array[i]) {
                decreasing = false;
                break;
            }
        }
        // Массив монотонен, если он является или возрастающим, или убывающим
        return increasing || decreasing;
    }

    public static void isMonotonicAnother (int[] array) {
        for (int i = 0; i < array.length; i++) {
            if ((array[i] == i + 1) || (i < i + 1) || (i > i + 1)) {
                System.out.println("массив монотонен");
            } else System.out.println("массив не  монотонен");
        }
    }
}
