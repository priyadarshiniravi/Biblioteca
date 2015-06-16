package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoviesPresenterTest {
    @Test
    public void shouldReturnToString() {
        String FormattedMovies = "MyString";
        MoviesPresenter moviesPresenter = new MoviesPresenter(FormattedMovies);

        String actualString=moviesPresenter.toString();

        assertEquals("MyString",actualString);
    }

  
}