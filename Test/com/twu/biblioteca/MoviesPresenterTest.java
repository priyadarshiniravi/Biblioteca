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

        moviesPresenter.addMovie("Minions", 2015, "xyz", 10,new InvalidUser("","","","",0));
        moviesPresenter.addMovie("UP", 2013, "xyz", 9,new InvalidUser("","","","",0));
        String actualFormattedMovies = moviesPresenter.toString();

        assertEquals("Minions,2015,xyz,10,\n" +
                "UP,2013,xyz,9,\n", actualFormattedMovies);
    }
}