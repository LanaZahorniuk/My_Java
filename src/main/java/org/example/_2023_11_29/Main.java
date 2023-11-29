package org.example._2023_11_29;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Book1", "Author", Genre.FICTION, BookStatus.AVAILABLE, LocalDate.of(2007, 1, 27), 300);
        Book book2 = new Book("Book1", "Author", Genre.NON_FICTION, BookStatus.BORROWED, LocalDate.of(1997, 3, 15), 1200);
        Book book3 = new Book("Book1", "Author", Genre.SCIENCE, BookStatus.RESERVED, LocalDate.of(1845, 12, 4), 800);
        Book book4 = new Book("Book1", "Author", Genre.FANTASY, BookStatus.UNDER_REPAIR, LocalDate.of(2023, 4, 30), 450);
        Book book5 = new Book("Book1", "Author", Genre.HISTORY, BookStatus.LOST, LocalDate.of(1977, 8, 28), 830);
        Book book6 = new Book("Book1", "Author", Genre.FANTASY, BookStatus.UNDER_REPAIR, LocalDate.of(2023, 4, 30), 450);
        Book book7 = new Book("Book1", "Author", Genre.BIOGRAPHY, BookStatus.LOST, LocalDate.of(1967, 10, 12), 230);

        Magazine magazine1 = new Magazine("Magazine", "Author", Genre.FANTASY, 100723, LocalDate.of(2012, 10, 2), false);
        Magazine magazine2 = new Magazine("Magazine", "Author", Genre.HISTORY, 120004, LocalDate.of(2023, 7, 15),true);


        List <LibraryItem> listBook = new ArrayList<>();
        listBook.add(book1);
        listBook.add(book2);
        listBook.add(book3);
        listBook.add(book4);
        listBook.add(book5);
        listBook.add(book6);
        listBook.add(book7);

        listBook.add(magazine1);
        listBook.add(magazine2);

        System.out.println(listBook);

    }
}
