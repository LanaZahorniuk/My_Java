package org.example._2023_11_22;

abstract class Employee implements EmployeeActions{
    public String name;
    public int age;
    public String department;
    public int salary;

    @Override
    public void work() {
        System.out.println("Employee working!");
    }

    @Override
    public void takeBreak() {
        System.out.println("Employee have coffee break!");
    }
}


/*
3.2. Абстрактный класс Employee:
Общие поля: name, age, department, salary.
Реализовать интерфейс EmployeeActions.
Абстрактные методы work() и takeBreak().
 */
