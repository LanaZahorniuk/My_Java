package org.example._2023_11_29;

import java.time.LocalDate;

/*
    Book (Книга) Реализует: LibraryItem, Borrowable, Maintainable
        Поля:
            BookStatus status
            LocalDate publishDate
            int pageCount
 */
public class Book extends LibraryItem implements Borrowable, Maintainable {

    BookStatus status;
    public LocalDate publishDate;
    public int pageCount;

    @Override
    public void borrowItem(User user) {

    }

    @Override
    public void returnItem(User user) {

    }

    @Override
    public boolean isAvailable() {
        return false;
    }

    @Override
    public void repairItem() {

    }

    @Override
    public void updateItemCondition(BookStatus condition) {

    }

    @Override
    public BookStatus checkCondition() {
        return null;
    }
}
