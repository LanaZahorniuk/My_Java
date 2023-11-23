package org.example._2023_11_22;

public class Developer extends Employee {
    public String programmingLanguage;
    public boolean remote;

    @Override
    public void work() {
        System.out.println("Developer working");

    }

    @Override
    public void takeBreak() {
        System.out.println("Developer have coffee break!");
    }
}

/*
3.4. Класс Developer:
Наследует Employee.
Дополнительные поля: programmingLanguage, remote (булево значение).
Реализация методов work() и takeBreak() с учетом специфики работы разработчика.
 */
