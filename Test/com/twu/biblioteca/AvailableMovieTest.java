package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AvailableMovieTest {
    @Test
    public void shouldBeNullMovieForReturnAvailableMovie() {
        AvailableMovie movie = new AvailableMovie("C", 1934, "XYZ", 1);

        Movie actualMovieCheckedOut = movie.returnMovie();
        NullMovie expectedMovie = new NullMovie(null, 0, null, 0);

        assertEquals(expectedMovie, actualMovieCheckedOut);

    }

    @Test
    public void shouldBeSuccessForCheckingOutAvailableMovie() {
        AvailableMovie movie = new AvailableMovie("C", 1934, "XYZ", 1);

        Movie actualMovieCheckedOut = movie.checkoutMovie();
        CheckedOutMovie expectedMovie = new CheckedOutMovie("C", 1934, "XYZ", 1);

        assertEquals(expectedMovie, actualMovieCheckedOut);

    }

    @Test
    public void shouldBeSuccessReturnInAvailableMovie() {
        AvailableMovie movie = new AvailableMovie("C", 1934, "XYZ", 1);

        String actualMessage = movie.returnMessage();

        assertEquals(Messages.SUCCESS_RETURN_MOVIE, actualMessage);
    }

}