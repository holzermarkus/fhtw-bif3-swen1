package at.fhtw.bif.bookstore.service;

import at.fhtw.bif.bookstore.model.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookServiceImpl implements BookService {

    private static List<Book> storedBooks = new ArrayList<>();

    static {
        storedBooks.add(new Book("Effective Java", "XYZ", "Joshua Bloch", "1234432"));
        storedBooks.add(new Book("Clean Code", "XYZ", "Robert C. Martin", "57564"));
        storedBooks.add(new Book("Clean Architecture", "ABC", "Robert C. Martin", "78643"));
    }

    @Override
    public void saveNewBook(Book book) {
        storedBooks.add(book);
    }

    @Override
    public List<Book> getAvailableBooks() {

        return storedBooks;
    }

    @Override
    public void lendBook(Book book) {

    }

    @Override
    public void returnBook(Book book) {

    }
}
