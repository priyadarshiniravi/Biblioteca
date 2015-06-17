package com.twu.biblioteca;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AvailableMovieTest {
    @Test
    public void shouldBeNullMovieForReturnAvailableMovie() {
        AvailableMovie movie = new AvailableMovie("C",1934, "XYZ", 1);

        Movie actualMovieCheckedOut = movie.returnMovie();
        NullMovie expectedMovie = new NullMovie(null,0, null, 0);

        assertEquals(expectedMovie, actualMovieCheckedOut);

    }

}