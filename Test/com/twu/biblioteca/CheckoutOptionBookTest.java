package com.twu.biblioteca;


import org.junit.Test;
import org.mockito.Matchers;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class CheckoutOptionBookTest {
    @Test
    public void ShouldTakeInputInvalid() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        Library library = mock(Library.class);
        User user=mock(User.class);
        when(library.checkoutBook(anyString(), Matchers.<User>any()))
                .thenReturn(new NullBook("","",0));
        CheckoutOptionBook checkoutOptionBook = new CheckoutOptionBook(consoleInputOutput, library);

        checkoutOptionBook.action(user);

        verify(consoleInputOutput, times(1)).getInputAsString();


    }

    @Test
    public void shouldBeSuccessfulCheckout() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        Library library = mock(Library.class);
        User user=mock(User.class);
        when(library.checkoutBook(anyString(), Matchers.<User>any()))
                .thenReturn(new CheckedOutBook("","",0, user));
        CheckoutOptionBook checkoutOptionBook = new CheckoutOptionBook(consoleInputOutput, library);

        checkoutOptionBook.action(user);

        verify(consoleInputOutput, times(1)).print(Messages.SUCCESS_CHECKOUT_BOOK);


    }

    @Test
    public void shouldBeUnsuccessfulCheckout() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        Library library = mock(Library.class);
        User user=mock(User.class);
        when(library.checkoutBook(anyString(), Matchers.<User>any()))
                .thenReturn(new NullBook(null,null,0));
        CheckoutOptionBook checkoutOptionBook = new CheckoutOptionBook(consoleInputOutput, library);

        checkoutOptionBook.action(user);

        verify(consoleInputOutput, times(1)).print(Messages.UNSUCCESS_CHECKOUT_BOOK);


    }




}