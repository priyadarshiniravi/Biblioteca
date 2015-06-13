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
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        Books books = mock(Books.class);
        when(books.toString())
                .thenReturn("Books list");
        ListBooks listBooks = new ListBooks(consoleInputOutput, books);

        listBooks.displayStrategy();

        verify(consoleInputOutput).print("Books list");


    }

}