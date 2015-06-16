package com.twu.biblioteca;

import org.junit.Test;

import static com.twu.biblioteca.Messages.SUCCESS_CHECKOUT;
import static org.junit.Assert.assertEquals;

public class CheckedOutMovieTest {
    @Test
    public void shouldBeSuccessForReturningCheckedOutMovie() {
        CheckedOutMovie movie = new CheckedOutMovie("C", 1998,"XYZ",10);

        Movie actualMovieAvailable = movie.returnMovie();
        AvailableMovie expectedMovie = new AvailableMovie("C", 1998,"XYZ",10);

        assertEquals(expectedMovie, actualMovieAvailable);

    }

    @Test
    public void shouldBeNullMovieForCheckoutOfCheckedOutMovie() {
        CheckedOutMovie movie = new CheckedOutMovie("C", 1998,"XYZ",10);

        Movie actualMovieAvailable = movie.checkoutMovie();
        NullMovie expectedMovie = new NullMovie(null, 0,null,0);

        assertEquals(expectedMovie, actualMovieAvailable);

    }

    @Test
    public void shouldBeSuccessMessageCheckoutInCheckoutMovie() {
        CheckedOutMovie movie = new CheckedOutMovie("C", 1998,"XYZ",10);

        String actualMessage = movie.checkoutMessage();

        assertEquals(SUCCESS_CHECKOUT,actualMessage);
    }
}