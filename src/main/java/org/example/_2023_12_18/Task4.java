package org.example._2023_12_18;

public class Task4 {

    //Создайте функциональный интерфейс UpperCaseConverter с методом convert, который преобразует строку в верхний регистр.
    //Напишите метод, который принимает строку и UpperCaseConverter интерфейс, и преобразует её в верхний регистр.
    public static void main(String[] args) {
        convertsUppercase(str -> System.out.println(str.toUpperCase()), "i love java");
    }

    public static void convertsUppercase(UpperCaseConverter up, String str) {
        up.convert(str);
    }
}

@FunctionalInterface
interface UpperCaseConverter {
    void convert(String str);
}