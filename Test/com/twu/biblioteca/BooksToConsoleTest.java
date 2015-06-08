package com.twu.biblioteca;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BooksToConsoleTest {
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldDisplayBookList() {
        Books books = mock(Books.class);
        when(books.toString())
                .thenReturn("BookList");
        BooksToConsole system = new BooksToConsole(books);

        system.displayBookList();

        Assert.assertEquals("BookList\n", outContent.toString());
    }


    @After
    public void cleanUpStreams() {
        System.setOut(null);

    }

}