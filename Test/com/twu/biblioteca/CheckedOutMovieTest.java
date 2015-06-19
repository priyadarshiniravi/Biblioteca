package com.twu.biblioteca;

import org.junit.Test;

import static com.twu.biblioteca.Messages.SUCCESS_CHECKOUT_MOVIE;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class CheckedOutMovieTest {
    @Test
    public void shouldBeSuccessForReturningCheckedOutMovie() {
        User user = mock(User.class);
        CheckedOutMovie movie = new CheckedOutMovie("C", 1998, "XYZ", 10,user);

        Movie actualMovieAvailable = movie.returnMovie(user);
        AvailableMovie expectedMovie = new AvailableMovie("C", 1998, "XYZ", 10);

        assertEquals(expectedMovie, actualMovieAvailable);

    }

    @Test
    public void shouldBeNullMovieForCheckoutOfCheckedOutMovie() {
        User user = mock(User.class);
        CheckedOutMovie movie = new CheckedOutMovie("C", 1998, "XYZ", 10,user);

        Movie actualMovieAvailable = movie.checkoutMovie(user);
        NullMovie expectedMovie = new NullMovie(null, 0, null, 0);

        assertEquals(expectedMovie, actualMovieAvailable);

    }

    @Test
    public void shouldBeSuccessMessageCheckoutInCheckoutMovie() {
        User user = mock(User.class);
        CheckedOutMovie movie = new CheckedOutMovie("C", 1998, "XYZ", 10,user);

        String actualMessage = movie.checkoutMessage();

        assertEquals(SUCCESS_CHECKOUT_MOVIE, actualMessage);
    }
}