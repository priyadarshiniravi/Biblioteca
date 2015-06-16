package com.twu.biblioteca;


import org.junit.Test;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class CheckoutBookTest {
    @Test
    public void ShouldTakeInputInvalid() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        Library library = mock(Library.class);
        CheckoutBook checkoutBook = new CheckoutBook(consoleInputOutput, library);

        checkoutBook.action();

        verify(consoleInputOutput, times(1)).getInputAsString();


    }

    @Test
    public void shouldBeSuccessfulCheckout() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        Library library = mock(Library.class);
        when(library.checkout(anyString()))
                .thenReturn(true);
        CheckoutBook checkoutBook = new CheckoutBook(consoleInputOutput, library);

        checkoutBook.action();

        verify(consoleInputOutput, times(1)).print(Messages.SUCCESS_CHECKOUT);


    }

    @Test
    public void shouldBeUnsuccessfulCheckout() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        Library library = mock(Library.class);
        when(library.checkout(anyString()))
                .thenReturn(false);
        CheckoutBook checkoutBook = new CheckoutBook(consoleInputOutput, library);

        checkoutBook.action();

        verify(consoleInputOutput, times(1)).print(Messages.UNSUCCESS_CHECKOUT);


    }


}