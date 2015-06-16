package com.twu.biblioteca;


import org.junit.Test;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class CheckoutOptionTest {
    @Test
    public void ShouldTakeInputInvalid() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        Library library = mock(Library.class);
        when(library.checkoutBook(anyString()))
                .thenReturn(new NullBook("","",0));
        CheckoutOption checkoutOption = new CheckoutOption(consoleInputOutput, library);

        checkoutOption.action();

        verify(consoleInputOutput, times(1)).getInputAsString();


    }

    @Test
    public void shouldBeSuccessfulCheckout() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        Library library = mock(Library.class);
        when(library.checkoutBook(anyString()))
                .thenReturn(new CheckedOutBook("","",0));
        CheckoutOption checkoutOption = new CheckoutOption(consoleInputOutput, library);

        checkoutOption.action();

        verify(consoleInputOutput, times(1)).print(Messages.SUCCESS_CHECKOUT);


    }

    @Test
    public void shouldBeUnsuccessfulCheckout() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        Library library = mock(Library.class);
        when(library.checkoutBook(anyString()))
                .thenReturn(new NullBook(null,null,0));
        CheckoutOption checkoutOption = new CheckoutOption(consoleInputOutput, library);

        checkoutOption.action();

        verify(consoleInputOutput, times(1)).print(Messages.UNSUCCESS_CHECKOUT);


    }




}