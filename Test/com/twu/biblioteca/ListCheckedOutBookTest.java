package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class ListCheckedOutBookTest {
    @Test
    public void shouldCheckBookDisplayStrategy() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        Library library = mock(Library.class);
        when(library.formattedCheckoutBookString())
                .thenReturn("Books list");
        ListCheckedOutBook listBooks = new ListCheckedOutBook(consoleInputOutput, library);
        User user = mock(User.class);
        Login login=mock(Login.class);
        MenuDispatcher menuDispatcher=mock(MenuDispatcher.class);

        listBooks.action(user,login,menuDispatcher);

        verify(consoleInputOutput).print("Books list");


    }

}