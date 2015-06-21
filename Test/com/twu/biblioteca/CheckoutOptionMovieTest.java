package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Matchers;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class CheckoutOptionMovieTest {
    @Test
    public void ShouldTakeInputInvalid() {
        User user=mock(User.class);
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        Library library = mock(Library.class);
        when(library.checkoutMovie(anyString(),(User)any()))
                .thenReturn(new NullMovie("", 0, "", 0));
        CheckoutOptionMovie checkoutOptionMovie = new CheckoutOptionMovie(consoleInputOutput, library);
        Login login=mock(Login.class);
        MenuDispatcher menuDispatcher=mock(MenuDispatcher.class);

        checkoutOptionMovie.action(user,login,menuDispatcher);

        verify(consoleInputOutput, times(1)).getInputAsString();


    }

    @Test
    public void shouldBeSuccessfulCheckout() {
        User user=mock(User.class);
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        Library library = mock(Library.class);
        when(library.checkoutMovie(anyString(), Matchers.<User>any()))
                .thenReturn(new CheckedOutMovie("", 0, "", 0,user));
        CheckoutOptionMovie checkoutOptionMovie = new CheckoutOptionMovie(consoleInputOutput, library);
        Login login=mock(Login.class);
        MenuDispatcher menuDispatcher=mock(MenuDispatcher.class);

        checkoutOptionMovie.action(user,login,menuDispatcher);

        verify(consoleInputOutput, times(1)).print(Messages.SUCCESS_CHECKOUT_MOVIE);


    }
}