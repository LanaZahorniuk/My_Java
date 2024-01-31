package org.example._2023_12_18;

import java.util.Optional;

public class Task3 {
    //Создайте функциональный интерфейс SafeDivision с методом divide, который безопасно делит два числа и возвращает Optional<Double>.
    //Реализуйте метод, который делит два числа с использованием SafeDivision, обрабатывая случай деления на ноль.

    public static void main(String[] args) {
        SafeDivision division = (a, b) -> b == 0 ? Optional.empty() : Optional.of(a / b);
        System.out.println("Результат: " + getDivide(division,10.2,0).orElse(Double.NaN));
    }

    public static Optional<Double> getDivide(SafeDivision division, double a, double b) {
        return division.divide(a, b);

    }
}

@FunctionalInterface
interface SafeDivision {
    Optional<Double> divide(double num1, double num2);
}
