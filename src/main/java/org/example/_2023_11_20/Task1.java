package org.example._2023_11_20;

public class Task1 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        odd(array);
    }

    public static void odd(int[] array) {
        int sumOdd = 0;   //нечетное
        int sumEven = 0;  //четное
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                sumOdd++;
            } else {
                sumEven++;
            }
        }
        System.out.println(sumOdd);
        System.out.println(sumEven);
    }
}
