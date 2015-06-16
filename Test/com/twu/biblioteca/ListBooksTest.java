package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class ListBooksTest {
    @Test
    public void shouldCheckBookDisplayStrategy() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        Library library = mock(Library.class);
        when(library.formattedBookString())
                .thenReturn("Books list");
        ListBooks listBooks = new ListBooks(consoleInputOutput, library);

        listBooks.action();

        verify(consoleInputOutput).print("Books list");


    }

}