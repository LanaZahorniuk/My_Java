package org.example._2023_11_20;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(power(5,3));
    }
    
    private static int power (int a, int b){
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
}
