package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class OutputMessagesTest {
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldDisplayWelcomeMessage() {
        OutputMessages system = new OutputMessages();

        system.displayWelcomeMessage();

        assertEquals("Welcome To Biblioteca!!!\n", outContent.toString());
    }

    @Test
    public void shouldDisplayBookList() {
        Books books=mock(Books.class);
        OutputMessages system = new OutputMessages();
        when(books.toString())
                .thenReturn("BookList");

        system.displayBookList(books);

        assertEquals("BookList\n", outContent.toString());
    }


    @After
    public void cleanUpStreams() {
        System.setOut(null);

    }

}