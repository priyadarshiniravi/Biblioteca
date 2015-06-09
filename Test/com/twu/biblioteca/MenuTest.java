package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MenuTest {
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }


    @Test
    public void shouldListenToOptionGetBooks() throws IOException {
        MenuToConsole menuToConsoleStub = mock(MenuToConsole.class);
        when(menuToConsoleStub.getMenuOption())
                .thenReturn(1);
        BooksToConsole bookToConsoleStub = mock(BooksToConsole.class);
        Menu menu = new Menu(bookToConsoleStub);

        menu.listenToOption(menuToConsoleStub);
        verify(menuToConsoleStub).getMenuOption();


    }

    @Test
    public void shouldListenToInvalidOption() throws IOException {
        MenuToConsole menuToConsoleStub = mock(MenuToConsole.class);
        when(menuToConsoleStub.getMenuOption())
                .thenReturn(2);
        BooksToConsole bookToConsoleStub = mock(BooksToConsole.class);
        Menu menu = new Menu(bookToConsoleStub);

        menu.listenToOption(menuToConsoleStub);

        Assert.assertEquals("Invalid Option\n", outContent.toString());


    }


}