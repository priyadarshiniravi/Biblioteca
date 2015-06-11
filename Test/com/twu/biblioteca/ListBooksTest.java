package com.twu.biblioteca;

import junit.framework.TestCase;
import org.junit.Test;
import org.mockito.Matchers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ListBooksTest {
    @Test
    public void shouldCheckBookDisplayStrategy() {
        Scanner consoleInput = new Scanner(System.in);
        ConsoleInputOutput consoleInputOutput = new ConsoleInputOutput(consoleInput);
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("C++", "Jones", 1992));
        Books books = new Books(bookList);
        ListBooks listBooks = new ListBooks(consoleInputOutput,books);

        listBooks.displayStrategy();

        verify(consoleInputOutput).print(Matchers.<String>any());


    }

}