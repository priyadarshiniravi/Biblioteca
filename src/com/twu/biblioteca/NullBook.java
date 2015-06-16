package com.twu.biblioteca;

public class NullBook extends Book {

    public NullBook(String name, String author, int yearOfPublication) {
        super(name, author, yearOfPublication);
    }

    public static NullBook createNullBook(AvailableBook availableBook) {

        return new NullBook(availableBook.name,availableBook.author,availableBook.yearOfPublication);
    }
}
