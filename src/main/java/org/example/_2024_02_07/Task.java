package org.example._2024_02_07;

import java.util.Arrays;
import java.util.Random;

public class Task {

    public static void main(String[] args) {
        //System.out.println(makeNumbers());
        //System.out.println(Arrays.toString(makeNumbers()));
        System.out.println(Arrays.toString(checkNumber()));


    }

    //генерация
//    public static String makeNumbers() {
//        Random random = new Random();
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < 16; i++) {
//            stringBuilder.append(random.nextInt(10));
//        }
//        return stringBuilder.toString();
//
//    }
    /*

                for (int j = 0; j < numbers.length; j++) {
                if (i % 2 == 0 && numbers[i] > 9) {
                    numbers[i] -= difference;
                    break;
                }
            }
             */

    public static int[] makeNumbers() {
        Random random = new Random();
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
        return arr;

    }

    //проверка
    public static int[] checkNumber() {
        int[] numbers = makeNumbers();
        int resultEven;
        int sumEven = 0;
        int sumOdd = 0;
        int sumAll;
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                numbers[i] *= 2;
                resultEven = numbers[i];
                if (resultEven > 9) {
                    resultEven = resultEven - 9;
                    sumEven += resultEven;
                }
            } else {
                sumOdd += numbers[i];
            }
            sumAll = sumEven + sumOdd;
            int difference = (10 - (sumAll % 10)) % 10;
            if (difference != 0) {
                for (int j = 0; j < numbers.length; j += 2) {
                    if (numbers[i] > 9) {
                        numbers[i] -= difference;
                        if (numbers[i] < 0) {
                            numbers[i] = 0;
                        }
                        break;
                    }
                }
            }
        }
        return numbers;
    }
}
