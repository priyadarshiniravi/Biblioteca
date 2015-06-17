package com.twu.biblioteca;


import org.junit.Test;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class CheckoutOptionBookTest {
    @Test
    public void ShouldTakeInputInvalid() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        Library library = mock(Library.class);
        when(library.checkoutBook(anyString()))
                .thenReturn(new NullBook("","",0));
        CheckoutOptionBook checkoutOptionBook = new CheckoutOptionBook(consoleInputOutput, library);

        checkoutOptionBook.action();

        verify(consoleInputOutput, times(1)).getInputAsString();


    }

    @Test
    public void shouldBeSuccessfulCheckout() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        Library library = mock(Library.class);
        when(library.checkoutBook(anyString()))
                .thenReturn(new CheckedOutBook("","",0));
        CheckoutOptionBook checkoutOptionBook = new CheckoutOptionBook(consoleInputOutput, library);

        checkoutOptionBook.action();

        verify(consoleInputOutput, times(1)).print(Messages.SUCCESS_CHECKOUT_BOOK);


    }

    @Test
    public void shouldBeUnsuccessfulCheckout() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        Library library = mock(Library.class);
        when(library.checkoutBook(anyString()))
                .thenReturn(new NullBook(null,null,0));
        CheckoutOptionBook checkoutOptionBook = new CheckoutOptionBook(consoleInputOutput, library);

        checkoutOptionBook.action();

        verify(consoleInputOutput, times(1)).print(Messages.UNSUCCESS_CHECKOUT_BOOK);


    }




}