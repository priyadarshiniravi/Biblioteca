package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class ListCheckedOutMovieTest {
    @Test
    public void shouldCheckMovieDisplayStrategy() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        Library library = mock(Library.class);
        when(library.formattedCheckedOutMovieString())
                .thenReturn("Movies list");
        User user = mock(User.class);
        ListCheckedOutMovie listMovies = new ListCheckedOutMovie(consoleInputOutput, library);

        listMovies.action(user);

        verify(consoleInputOutput).print("Movies list");


    }

}