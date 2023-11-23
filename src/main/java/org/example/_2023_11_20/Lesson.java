package org.example._2023_11_20;

public class Lesson {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        System.out.println(getSum(arr));
    }

    public static int getSum (int[] array){
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result = array [i] + result; // result += array[i];
        }
        return result;
    }
}
