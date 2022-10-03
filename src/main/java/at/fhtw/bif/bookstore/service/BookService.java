package at.fhtw.bif.bookstore.service;

import at.fhtw.bif.bookstore.model.Book;

import java.util.List;

public interface BookService {

    void saveNewBook(Book book);
    List<Book> getAvailableBooks();
    void lendBook(Book book);
    void returnBook(Book book);

}
