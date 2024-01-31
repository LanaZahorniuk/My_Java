package org.example._2023_12_18;

public class Task5 {
    //Создайте функциональный интерфейс Logger с методом log, который принимает строку и выводит её в консоль.
    //Напишите метод, который использует Logger для логирования различных сообщений.

    public static void main(String[] args) {
        getLogger(s -> System.out.println(s), "hallo");

    }
    public static void getLogger (Logger logger, String s) {
        logger.log(s);
    }

}
@FunctionalInterface
interface Logger {
    void log(String s);
}