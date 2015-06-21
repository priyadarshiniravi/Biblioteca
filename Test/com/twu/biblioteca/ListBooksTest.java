package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class ListBooksTest {
    @Test
    public void shouldCheckBookDisplayStrategy() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        Library library = mock(Library.class);
        when(library.formattedAvailableBookString())
                .thenReturn("Books list");
        ListBooks listBooks = new ListBooks(consoleInputOutput, library);
        User user=mock(User.class);
        Login login=mock(Login.class);
        MenuDispatcher menuDispatcher=mock(MenuDispatcher.class);

        listBooks.action(user,login,menuDispatcher);

        verify(consoleInputOutput).print("Books list");


    }

}