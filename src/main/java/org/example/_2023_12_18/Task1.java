package org.example._2023_12_18;

public class Task1 {
    //Создайте функциональный интерфейс StringLength с методом getLength, который принимает строку и возвращает её длину.
    //Напишите метод, который принимает строку и StringLength интерфейс и выводит длину строки.

    public static void main(String[] args) {
        str(str -> System.out.println(str.length()), "Lana");
    }

    public static void str(StringLength s, String str) {
        s.getLength(str);
    }

}

@FunctionalInterface
interface StringLength {
    void getLength(String str);
}
