package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class ReturnMovieTest {
    @Test
    public void ShouldTakeInput() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        Library library = mock(Library.class);
        when(library.returnMovie(anyString()))
                .thenReturn(new NullMovie("",0, "", 0));
        ReturnMovie returnMovie = new ReturnMovie(consoleInputOutput, library);
        User user=mock(User.class);

        returnMovie.action(user);

        verify(consoleInputOutput, times(1)).getInputAsString();


    }

    @Test
    public void shouldBeSuccessfulReturn() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        Library library = mock(Library.class);
        when(library.returnMovie(anyString()))
                .thenReturn(new AvailableMovie("",0,"",0));
        ReturnMovie returnMovie = new ReturnMovie(consoleInputOutput, library);
        User user=mock(User.class);

        returnMovie.action(user);

        verify(consoleInputOutput, times(1)).print(Messages.SUCCESS_RETURN_MOVIE);


    }

}