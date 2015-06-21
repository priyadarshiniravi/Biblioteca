package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class ListMovieTest {
    @Test
    public void shouldCheckMovieDisplayStrategy() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        Library library = mock(Library.class);
        when(library.formattedAvailableMovieString())
                .thenReturn("Movies list");
        User user=mock(User.class);
        ListMovie listMovies = new ListMovie(consoleInputOutput, library);
        Login login=mock(Login.class);
        MenuDispatcher menuDispatcher=mock(MenuDispatcher.class);

        listMovies.action(user,login,menuDispatcher);

        verify(consoleInputOutput).print("Movies list");


    }

}