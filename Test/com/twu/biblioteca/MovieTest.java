package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MovieTest {
    @Test
    public void shouldAppendMovieToFormattedMovies() {
        MoviesPresenter moviesPresenter = mock(MoviesPresenter.class);
        CheckedOutMovie movie=new CheckedOutMovie("Minions", 2015, "xyz", 10);

        movie.appendToMovies(moviesPresenter);

        verify(moviesPresenter).addMovie("Minions", 2015, "xyz", 10);

    }

}