package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AvailableMovieTest {
    @Test
    public void shouldBeNullMovieForReturnAvailableMovie() {
        AvailableMovie movie = new AvailableMovie("C", 1934, "XYZ", 1);
        User user = mock(User.class);

        Movie actualMovieCheckedOut = movie.returnMovie(user);
        NullMovie expectedMovie = new NullMovie(null, 0, null, 0);

        assertEquals(expectedMovie, actualMovieCheckedOut);

    }

    @Test
    public void shouldBeSuccessForCheckingOutAvailableMovie() {
        AvailableMovie movie = new AvailableMovie("C", 1934, "XYZ", 1);
        User user = mock(User.class);

        Movie actualMovieCheckedOut = movie.checkoutMovie(user);
        CheckedOutMovie expectedMovie = new CheckedOutMovie("C", 1934, "XYZ", 1,user);

        assertEquals(expectedMovie, actualMovieCheckedOut);

    }

    @Test
    public void shouldBeSuccessReturnInAvailableMovie() {
        AvailableMovie movie = new AvailableMovie("C", 1934, "XYZ", 1);

        String actualMessage = movie.returnMessage();

        assertEquals(Messages.SUCCESS_RETURN_MOVIE, actualMessage);
    }

    @Test
    public void shouldAppendMovieToFormattedMovies() {
        MoviesPresenter moviesPresenter = mock(MoviesPresenter.class);
        AvailableMovie movie=new AvailableMovie("Minions", 2015, "xyz", 10);

        movie.appendToAvailableMovies(moviesPresenter);

        verify(moviesPresenter).addMovie("Minions", 2015, "xyz", 10,new InvalidUser("","","","",0));

    }
}