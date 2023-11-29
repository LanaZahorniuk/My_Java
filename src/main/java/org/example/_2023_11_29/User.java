package org.example._2023_11_29;

import java.util.List;

/*
   User (Пользователь) Реализует: Searchable
        Поля:
            String name
            String id
            List<LibraryItem> borrowedItems
 */
public class User implements Searchable {
    public String name;
    public String id;
    public List<LibraryItem> borrowedItems;

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