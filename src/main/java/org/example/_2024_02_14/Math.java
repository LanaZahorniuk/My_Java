package org.example._2024_02_14;

public class Math {

    //Сложение (add): Принимает два числа и возвращает их сумму.
    public int sum(int a, int b) {
        return a + b;
    }

    //Вычитание (subtract): Принимает два числа и возвращает результат их вычитания.

    //Умножение (multiply): Принимает два числа и возвращает их произведение.

    //Деление (divide): Принимает два числа и возвращает результат деления первого на второе. Необходимо обработать случай деления на ноль.

    //Возведение в степень (power): Принимает основание и показатель степени, возвращает результат возведения числа в степень.
    public int power(int a, int b) {
        int result = a;
        for (int i = 1; i < b; i++) {
            result *= a;
        }
        return result;
    }

    //Факториал (factorial): Принимает число и возвращает его факториал. Должна быть обработка отрицательных чисел.
    public int factorial(int a, int b) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }

    //Модуль числа (absolute): Принимает число и возвращает его абсолютное значение.
    public int absolute (int a){
        //java.lang.Math.abs(a);
        if (a<0) {
            return  -a;
        } return a;
    }

    //Квадратный корень (sqrt): Принимает число и возвращает квадратный корень числа. Необходимо учесть обработку отрицательных чисел.
    public double sqrt(double a){
        //java.lang.Math.sqrt(2);
        if(a < 0){
            throw new ArithmeticException();
        }
        if (a == 0) {
            return 0;
        }

        double estimate = a / 2.0; // Начальное приближенное значение

        for (int i = 0; i < 10; i++) { // Производим 10 итераций для уточнения
            estimate = 0.5 * (estimate + a / estimate);
        }

        return estimate;
    }
}
