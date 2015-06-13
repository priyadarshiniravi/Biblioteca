package com.twu.biblioteca;

public class BookParser {
    String input;

    public BookParser(String input) {
        this.input=input;
    }

    public Book Parse()
    {
        return(new Book(input,"",0));
    }
}
