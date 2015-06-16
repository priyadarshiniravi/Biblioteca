package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoviesPresenterTest {
    @Test
    public void shouldReturnToString() {
        String FormattedMovies = "MyString";
        MoviesPresenter moviesPresenter = new MoviesPresenter(FormattedMovies);

        String actualString = moviesPresenter.toString();

        assertEquals("MyString", actualString);
    }

    @Test
    public void shouldAddMovieToTheFormattedMovieList() {
        String FormattedMovies = new String();
        MoviesPresenter moviesPresenter = new MoviesPresenter(FormattedMovies);

        moviesPresenter.addMovie("Minions", 2015, "xyz", 10);
        moviesPresenter.addMovie("UP", 2013, "xyz", 9);
        String actualFormattedMovies = moviesPresenter.toString();

        assertEquals("Minions,2015,xyz,10\nUP,2013,xyz,9\n", actualFormattedMovies);
    }
}