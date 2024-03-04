package org.example._2024_02_21;

import org.example._2024_02_21.taski.Book;
import org.example._2024_02_21.taski.BookRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class BookRepositoryImplement implements BookRepository {
    private final List<Book> bookList;

    public BookRepositoryImplement() {
        this.bookList = new ArrayList<>();
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void addToList (Book book) {
        bookList.add(book);
    }

    @Override
    public Optional<Book> findById(String id) {
        return bookList.stream()
                .filter(el -> Objects.equals(el.getId(), id))
                .findFirst();
    }

    @Override
    public List<Book> findAll() {
        return null;
    }

    @Override
    public Book save(Book book) {
        return null;
    }

    @Override
    public void deleteById(String id) {

    }

    @Override
    public boolean existsById(String id) {
        return false;
    }

    @Override
    public List<Book> findByAuthor(String author) {
        return null;
    }

    @Override
    public Optional<Book> findByTitle(String title) {
        return Optional.empty();
    }

    @Override
    public List<Book> findContainingTitle(String title) {
        return null;
    }
}
