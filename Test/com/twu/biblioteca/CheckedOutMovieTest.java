package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckedOutMovieTest {
    @Test
    public void shouldBeSuccessForReturningCheckedOutMovie() {
        CheckedOutMovie movie = new CheckedOutMovie("C", 1998,"XYZ",10);

        Movie actualMovieAvailable = movie.returnMovie();
        AvailableMovie expectedMovie = new AvailableMovie("C", 1998,"XYZ",10);

        assertEquals(expectedMovie, actualMovieAvailable);

    }
}