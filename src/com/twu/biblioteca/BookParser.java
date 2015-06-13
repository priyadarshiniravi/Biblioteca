package com.twu.biblioteca;

public class BookParser {

    public Book Parse(String input)
    {
        return(new Book(input,"",0));
    }
}
