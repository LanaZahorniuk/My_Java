package org.example._2023_11_29;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/*
    Book (Книга) Реализует: LibraryItem, Borrowable, Maintainable
        Поля:
            BookStatus status
            LocalDate publishDate
            int pageCount  11111
 */
public class Book extends LibraryItem implements Borrowable, Maintainable {

    BookStatus status;
    public LocalDate publishDate;
    public int pageCount;


    public Book(String title, String author, Genre genre, BookStatus status, LocalDate publishDate, int pageCount) {
        super(title, author, genre);
        this.status = status;
        this.publishDate = publishDate;
        this.pageCount = pageCount;
    }

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
    public ItemCondition checkCondition() {
        return null;
    }

    @Override
    public String toString() {
        return "status: " + status +
                ", publishDate: " + publishDate +
                ", pageCount: " + pageCount +
                ", title: " + title+
                ", author: " + author +
                ", genre: " + genre;
    }
}
