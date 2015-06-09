package com.twu.biblioteca;

import org.junit.Test;

import java.io.IOException;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MenuTest {

    @Test
    public void shouldListenToOption() throws IOException {
        MenuToConsole menuToConsoleStub = mock(MenuToConsole.class);
        when(menuToConsoleStub.getMenuOption())
                .thenReturn(1);
        BooksToConsole bookToConsoleStub = mock(BooksToConsole.class);
        Menu menu = new Menu(bookToConsoleStub);

        menu.listenToOption(menuToConsoleStub);
        verify(menuToConsoleStub).getMenuOption();


    }


}