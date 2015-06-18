package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class CheckoutOptionMovieTest {
    @Test
    public void ShouldTakeInputInvalid() {
        User user=mock(User.class);
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        Library library = mock(Library.class);
        when(library.checkoutMovie(anyString()))
                .thenReturn(new NullMovie("", 0, "", 0));
        CheckoutOptionMovie checkoutOptionMovie = new CheckoutOptionMovie(consoleInputOutput, library);

        checkoutOptionMovie.action(user);

        verify(consoleInputOutput, times(1)).getInputAsString();


    }

    @Test
    public void shouldBeSuccessfulCheckout() {
        User user=mock(User.class);
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        Library library = mock(Library.class);
        when(library.checkoutMovie(anyString()))
                .thenReturn(new CheckedOutMovie("", 0, "", 0));
        CheckoutOptionMovie checkoutOptionMovie = new CheckoutOptionMovie(consoleInputOutput, library);

        checkoutOptionMovie.action(user);

        verify(consoleInputOutput, times(1)).print(Messages.SUCCESS_CHECKOUT_MOVIE);


    }
}