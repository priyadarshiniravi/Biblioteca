package com.twu.biblioteca;

public class NullBook extends Book {

    public NullBook(String name, String author, int yearOfPublication) {
        super(name, author, yearOfPublication);
    }

    public static NullBook createNullBook() {

        return new NullBook(null,null,0);
    }
}
