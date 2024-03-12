package org.example._2024_03_11;

import java.util.Arrays;
import java.util.Scanner;

public class Kaprekar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number: ");
        String number = scanner.nextLine();
        System.out.println(Kaprekar.getKaprekarsConst(number));
    }

    static public String getKaprekarsConst(String number) throws IllegalArgumentException {

        if (number.length() < 3) {
            throw new IllegalArgumentException();
        }
        int result = 0;
        int finalResult;
        do {
            finalResult = result;
            char[] chars = number.toCharArray();
            Arrays.sort(chars);
            StringBuilder stringBuilder = new StringBuilder();

            for (char aChar : chars) {
                stringBuilder.append(aChar);
            }

            String inc = String.valueOf(stringBuilder);
            String dek = String.valueOf(stringBuilder.reverse());


            int i = Integer.parseInt(inc);
            int d = Integer.parseInt(dek);

            result = d - i;

            number = String.valueOf(result);
        } while (result != finalResult);
        return String.valueOf(finalResult);

    }
}