package org.example._2023_11_22;

public class Manager extends Employee {

    public int teamSize;
    public int [] teamMembers;

    @Override
    public void work() {
        System.out.println("Manager working");

    }

    @Override
    public void takeBreak() {
        System.out.println("Manager have coffee break!");
    }
}


/*
3.3. Класс Manager:
Наследует Employee.
Дополнительные поля: teamSize, массив teamMembers.
Реализация методов work() и takeBreak() с учетом роли менеджера.
 */