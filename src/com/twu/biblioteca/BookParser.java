package com.twu.biblioteca;

public class BookParser {

    public Book parse(String input) {
        return (new Book(input, "", 0));
    }
}
