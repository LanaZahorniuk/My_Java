package org.example._2023_11_22;

public class HRManager extends Employee{
    public int numberOfRecruitments;
    public int [] candidateList;
    @Override
    public void work() {
        System.out.println("HRManager looking for a new employee");

    }

    @Override
    public void takeBreak() {
        System.out.println("HRManager have coffee break!");
    }
}

/*
3.5. Класс HRManager:
Наследует Employee.
Дополнительные поля: numberOfRecruitments, массив candidateList.
Реализация методов work() и takeBreak() для HR-специалиста.
 */
