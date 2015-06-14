package com.twu.biblioteca;

import junit.framework.TestCase;
import org.junit.Test;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class ReturnBookTest {
    @Test
    public void ShouldTakeInput()
    {
        ConsoleInputOutput consoleInputOutput=mock(ConsoleInputOutput.class);
        Books books=mock(Books.class);
        CheckoutBook checkoutBook=new CheckoutBook(consoleInputOutput,books);

        checkoutBook.displayStrategy();

        verify(consoleInputOutput,times(1)).getInputAsString();


    }

    @Test
    public void shouldBeUnsuccessfulReturn()
    {
        ConsoleInputOutput consoleInputOutput=mock(ConsoleInputOutput.class);
        Books books=mock(Books.class);
        when(books.returnBook(anyString()))
                .thenReturn(false);
        ReturnBook returnBook=new ReturnBook(consoleInputOutput,books);

        returnBook.displayStrategy();

        verify(consoleInputOutput,times(1)).print(Messages.UNSUCCESSFUL_RETURN);


    }

    @Test
    public void shouldBesuccessfulReturn()
    {
        ConsoleInputOutput consoleInputOutput=mock(ConsoleInputOutput.class);
        Books books=mock(Books.class);
        when(books.returnBook(anyString()))
                .thenReturn(true);
        ReturnBook returnBook=new ReturnBook(consoleInputOutput,books);

        returnBook.displayStrategy();

        verify(consoleInputOutput,times(1)).print(Messages.SUCCESS_RETURN);


    }

}