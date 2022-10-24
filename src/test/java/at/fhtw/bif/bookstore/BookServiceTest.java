package at.fhtw.bif.bookstore;

import at.fhtw.bif.bookstore.model.Book;
import at.fhtw.bif.bookstore.model.BookType;
import at.fhtw.bif.bookstore.service.BookService;
import at.fhtw.bif.bookstore.service.BookServiceImpl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.List;

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
        book.setBookType(BookType.KINDLE);
        bookService.saveNewBook(book);
        List<Book> books = bookService.getAvailableBooks();
        Assertions.assertEquals(sizeBeforeSave+1, books.size());
        books.forEach(b -> {
            System.out.println(b);
            System.out.println(b.getBookType().isPrefered());
            System.out.printf("ordinal [%d] id [%d] %s : %s\n",
                    b.getBookType().ordinal(),
                    b.getBookType().getId(),
                    b.getBookType().name(),
                    b.getBookType().getCaption());

        });
    }

    @Test
    public void testGetAvailableBooks() {
        List<Book> books = bookService.getAvailableBooks();
        Assertions.assertEquals(3, books.size());
    }

    @Test
    public void testBookTypeEnum() {
        int value = 4;


        BookType.getByValue(2);


        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            BookType.getByValue(value);
        });

        Assertions.assertTrue(exception.getMessage().contains("no BookType for value 4"));
    }


}
