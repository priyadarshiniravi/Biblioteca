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
        Login login=mock(Login.class);
        MenuDispatcher menuDispatcher=mock(MenuDispatcher.class);

        listMovies.action(user,login,menuDispatcher);

        verify(consoleInputOutput).print("Movies list");


    }

}