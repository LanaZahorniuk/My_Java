package org.example._2024_02_21;

import org.example._2024_02_21.taski.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class BookRepositoryImplementTest {
    private static final BookRepositoryImplement BOOK_REPOSITORY_IMPLEMENT = new BookRepositoryImplement();

    private static  final Book book1 = new Book("001", "hello", "author");
    private static  final Book book2 = new Book("002", "hello2", "author2");
    private static  final Book book3 = new Book("003", "hello3", "author3");

    @BeforeEach
    public void setUp(){
        BOOK_REPOSITORY_IMPLEMENT.getBookList().clear();
        BOOK_REPOSITORY_IMPLEMENT.addToList(book1);
        BOOK_REPOSITORY_IMPLEMENT.addToList(book2);
        BOOK_REPOSITORY_IMPLEMENT.addToList(book3);
    }

    @Test
    void findByIdTest() {
        Assertions.assertEquals(Optional.of(book1), BOOK_REPOSITORY_IMPLEMENT.findById("001"));
    }

    @Test
    void findByIdValidTest() {
        Assertions.assertTrue(BOOK_REPOSITORY_IMPLEMENT.findById("000").isEmpty());
    }

    @Test
    void findAll() {
    }

    @Test
    void save() {
    }

    @Test
    void deleteById() {
    }

    @Test
    void existsById() {
    }

    @Test
    void findByAuthor() {
    }

    @Test
    void findByTitle() {
    }

    @Test
    void findContainingTitle() {
    }
}