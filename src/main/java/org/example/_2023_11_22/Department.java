package org.example._2023_11_22;

public class Department implements DepartmentOperations{
    public String departmentName;
    public String [] employees;
    public int currentSize;
    public int maxSize;

    public Department(String departmentName, String[] employees, int currentSize, int maxSize) {
        this.departmentName = departmentName;
        this.employees = employees;
        this.currentSize = currentSize;
        this.maxSize = maxSize;
    }

    @Override
    public void addEmployee(Employee employee) {

    }

    @Override
    public void removeEmployee(String name) {

    }
}

/*
3.7. Класс Department:
Поля: departmentName, массив employees, currentSize, maxSize.
Реализация интерфейса DepartmentOperations.
 */
