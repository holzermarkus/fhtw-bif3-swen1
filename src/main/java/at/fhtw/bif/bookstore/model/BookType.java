package at.fhtw.bif.bookstore.model;

import java.io.FileNotFoundException;

public enum BookType {

    PAPER("Papier", 1), KINDLE("Digital", 2);

    private final String caption;
    private final int id;

    BookType(String caption, int id) {
        this.caption = caption;
        this.id = id;
    }

    public String getCaption() {
        return caption;
    }

    public int getId() {
        return id;
    }

    public boolean isPrefered() {
        return this == PAPER;
    }

    public static BookType getByValue(int value) throws IllegalArgumentException {
        for (BookType e : BookType.values()) {
            if (e.getId() == value) {
                return e;
            }
        }
        throw new IllegalArgumentException("no BookType for value " + value);
    }


}
