package at.fhtw.bif.bookstore.model;

public class Book {

    private String title;
    private String publisher;
    private String author;
    private String isbn;
    private BookType bookType = BookType.PAPER;

    public Book(String title, String publisher, String author, String isbn) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.isbn = isbn;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", bookType=" + bookType +
                '}';
    }
}
