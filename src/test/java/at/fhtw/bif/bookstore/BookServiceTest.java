package at.fhtw.bif.bookstore;

import at.fhtw.bif.bookstore.model.Book;
import at.fhtw.bif.bookstore.service.BookService;
import at.fhtw.bif.bookstore.service.BookServiceImpl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Objects;

public class BookServiceTest {

    BookService bookService;

    @BeforeAll
    public static void beforeClazz() {
        System.out.println("BeforeAll");
    }


    @BeforeEach
    public void testA() {
        System.out.println("BeforeEach");
        bookService = new BookServiceImpl();
    }

    @Test
    public void testSaveNewBook() {
        int sizeBeforeSave = bookService.getAvailableBooks().size();
        Book book = new Book("Effective Java", "", "Joshua", "XXXXX");
        bookService.saveNewBook(book);
        List books = bookService.getAvailableBooks();
        Assertions.assertEquals(sizeBeforeSave+1, books.size());
        books.forEach(b -> {
            System.out.println(b instanceof Object);
        });
    }

    @Test
    public void testGetAvailableBooks() {
        List<Book> books = bookService.getAvailableBooks();
        Assertions.assertEquals(3, books.size());
    }


}
