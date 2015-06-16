package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class ReturnBookTest {
    @Test
    public void ShouldTakeInput() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        Library library = mock(Library.class);
        when(library.returnBook(anyString()))
                .thenReturn(new NullBook("","",0));
        ReturnBook returnBook = new ReturnBook(consoleInputOutput, library);

        returnBook.action();

        verify(consoleInputOutput, times(1)).getInputAsString();


    }

    @Test
    public void shouldBeUnsuccessfulReturn() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        Library library = mock(Library.class);
        when(library.returnBook(anyString()))
                .thenReturn(new NullBook("","",0));
        ReturnBook returnBook = new ReturnBook(consoleInputOutput, library);

        returnBook.action();

        verify(consoleInputOutput, times(1)).print(Messages.UNSUCCESSFUL_RETURN);


    }

    @Test
    public void shouldBeSuccessfulReturn() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        Library library = mock(Library.class);
        when(library.returnBook(anyString()))
                .thenReturn(new AvailableBook("","",0));
        ReturnBook returnBook = new ReturnBook(consoleInputOutput, library);

        returnBook.action();

        verify(consoleInputOutput, times(1)).print(Messages.SUCCESS_RETURN);


    }

}