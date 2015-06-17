package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class ListMovieTest {
    @Test
    public void shouldCheckMovieDisplayStrategy() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        Library library = mock(Library.class);
        when(library.formattedMovieString())
                .thenReturn("Movies list");
        ListMovie listMovies = new ListMovie(consoleInputOutput, library);

        listMovies.action();

        verify(consoleInputOutput).print("Movies list");


    }

}