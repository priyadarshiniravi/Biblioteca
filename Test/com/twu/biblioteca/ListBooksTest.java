package com.twu.biblioteca;

import junit.framework.TestCase;
import org.junit.Test;

import java.io.IOException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ListBooksTest {
    @Test
    public void shouldCheckBookDisplayStrategy() {
        BooksToConsole bookToConsoleStub = mock(BooksToConsole.class);
        ListBooks listBooks = new ListBooks(bookToConsoleStub);

        listBooks.displayStrategy();

        verify(bookToConsoleStub).displayBookList();


    }

}