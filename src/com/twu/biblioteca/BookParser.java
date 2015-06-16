package com.twu.biblioteca;

public class BookParser {

    public Book parse(String input) {
        return (new AvailableBook(input, "", 0));
    }
}
