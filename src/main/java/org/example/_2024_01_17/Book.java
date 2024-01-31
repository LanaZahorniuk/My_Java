package org.example._2024_01_17;

import java.util.Arrays;
import java.util.List;

public class Book {
    /*
    Задача 3: Напишите метод, который объединяет строки из списка объектов.
class Book {
    private String title;
    private List<String> authors;
}

public List<String> getAuthorsTitles(List<Book> books) {
}
     */

    public static void main(String[] args) {
        List<Book> bookList = Arrays.asList(
                new Book("Book1", Arrays.asList("Authors1", "Authors2")),
                new Book("Book2", Arrays.asList("Authors3", "Authors4")),
                new Book("Book3", Arrays.asList("Authors5", "Authors6"))
        );

        System.out.println(getAuthorsTitles(bookList));
    }


    static public List<String> getAuthorsTitles(List<Book> books) {
        return books.stream()
                .flatMap(b -> b.getAuthors().stream())
                .toList();
    }

    private String title;
    private List<String> authors;

    public Book(String title, List<String> authors) {
        this.title = title;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getAuthors() {
        return authors;
    }
}
