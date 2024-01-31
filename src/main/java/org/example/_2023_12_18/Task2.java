package org.example._2023_12_18;

public class Task2 {
    //Создайте функциональный интерфейс NumberOperation с методом operate, который принимает два целых числа и возвращает целое число.
    //Напишите методы для выполнения базовых арифметических операций (сложение, вычитание, умножение, деление) с использованием этого интерфейса.
    public static void main(String[] args) {
        operation ((num1, num2) -> System.out.println(num1+num2),5,5);
        operation ((num1, num2) -> System.out.println(num1-num2),10,5);
        operation ((num1, num2) -> System.out.println(num1*num2),5,5);
        operation ((num1, num2) -> System.out.println(num1/num2),10,2);
    }

    public static void operation (NumberOperation numOper, int num1, int num2) {
        numOper.operate(num1,num2);
    }
}
@FunctionalInterface
interface NumberOperation {
    void operate(int num1, int num2);
}
