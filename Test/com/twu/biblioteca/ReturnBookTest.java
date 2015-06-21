package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class ReturnBookTest {
    @Test
    public void ShouldTakeInput() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        Library library = mock(Library.class);
        User user=mock(User.class);
        when(library.returnBook(anyString(),(User)any()))
                .thenReturn(new NullBook("","",0));
        ReturnBook returnBook = new ReturnBook(consoleInputOutput, library);
        Login login=mock(Login.class);
        MenuDispatcher menuDispatcher=mock(MenuDispatcher.class);

        returnBook.action(user,login,menuDispatcher);

        verify(consoleInputOutput, times(1)).getInputAsString();


    }

    @Test
    public void shouldBeUnsuccessfulReturn() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        Library library = mock(Library.class);
        User user=mock(User.class);
        when(library.returnBook(anyString(),(User)any()))
                .thenReturn(new NullBook("","",0));
        ReturnBook returnBook = new ReturnBook(consoleInputOutput, library);
        Login login=mock(Login.class);
        MenuDispatcher menuDispatcher=mock(MenuDispatcher.class);

        returnBook.action(user,login,menuDispatcher);

        verify(consoleInputOutput, times(1)).print(Messages.UNSUCCESSFUL_RETURN_BOOK);


    }

    @Test
    public void shouldBeSuccessfulReturn() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        Library library = mock(Library.class);
        User user=mock(User.class);
        when(library.returnBook(anyString(),(User) any()))
                .thenReturn(new AvailableBook("","",0));
        ReturnBook returnBook = new ReturnBook(consoleInputOutput, library);
        Login login=mock(Login.class);
        MenuDispatcher menuDispatcher=mock(MenuDispatcher.class);

        returnBook.action(user,login,menuDispatcher);

        verify(consoleInputOutput, times(1)).print(Messages.SUCCESS_RETURN_BOOK);


    }

}