package org.example._2023_11_29;

import java.util.List;

/*
    Librarian (Библиотекарь) Реализует: Maintainable
        Поля:
            String name
            String employeeId
            List<LibraryItem> managedItems

 */
public class Librarian implements Maintainable{
    public String name;
    public String employeeId;
    public List<LibraryItem> managedItems;

    @Override
    public void repairItem() {

    }

    @Override
    public void updateItemCondition(BookStatus condition) {

    }

    @Override
    public ItemCondition checkCondition() {
        return null;
    }
}
