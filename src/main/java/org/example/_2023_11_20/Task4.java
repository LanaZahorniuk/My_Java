package org.example._2023_11_20;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, -5};
        System.out.println(findMin(arr));
    }

    private static int findMin(int[] array) {
        int minNumber = 0;
        int secondMin = 0;
        for (int i = 0; i < array.length; i++) {

            if (minNumber > array[i]) {
                minNumber = array[i];

            }
            if (minNumber > array[i] || array[i] < array[i + 1]) {
                secondMin = array[i];

            }
        }
        return secondMin;
    }
}
