package org.example._2023_11_20;

public class Arr {
    private static int sum(int[] array) {
        int result = 0;
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            result += array[start] + array[end];
            start++;
            end--;
        }

        if (array.length % 2 != 0) {
            result += array[array.length / 2];

        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sum(arr));
    }
}
