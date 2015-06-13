package com.twu.biblioteca;

import junit.framework.TestCase;
import org.junit.Test;
import org.mockito.Matchers;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class CheckoutBookTest {
    @Test
    public void ShouldTakeInputInvalid()
    {
        ConsoleInputOutput consoleInputOutput=mock(ConsoleInputOutput.class);
        Books books=mock(Books.class);
        CheckoutBook checkoutBook=new CheckoutBook(consoleInputOutput,books);

        checkoutBook.displayStrategy();

        verify(consoleInputOutput,times(1)).getInputAsString();


    }

}