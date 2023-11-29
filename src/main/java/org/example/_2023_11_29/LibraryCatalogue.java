package org.example._2023_11_29;

import java.util.List;

/*
  LibraryCatalogue (Каталог Библиотеки) Реализует: Searchable
        Поля:
            List<Book> books
            List<Magazine> magazines
 */
public class LibraryCatalogue implements Searchable {
    public List<Book> books;

    public List<Magazine> magazines;

    @Override
    public List<LibraryItem> findByTitle(String title) {
        return null;
    }

    @Override
    public List<LibraryItem> findByAuthor(String author) {
        return null;
    }

    @Override
    public List<LibraryItem> findByGenre(Genre genre) {
        return null;
    }
}
