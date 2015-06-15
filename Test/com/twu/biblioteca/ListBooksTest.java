package com.twu.biblioteca;

import org.junit.Test;

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

        listBooks.action();

        verify(consoleInputOutput).print("Books list");


    }

}