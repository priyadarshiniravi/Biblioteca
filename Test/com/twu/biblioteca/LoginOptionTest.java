package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class LoginOptionTest {
    @Test
    public void shouldCheckMovieDisplayStrategy() {
        User user = mock(User.class);
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        Library library = mock(Library.class);
        Login login = mock(Login.class);
        MenuDispatcher menuDispatcher = mock(MenuDispatcher.class);
        when(login.loginWindow())
                .thenReturn(user);
        when(user.dispatchMenu(menuDispatcher,login))
                .thenReturn(1);
        when(library.formattedAvailableMovieString())
                .thenReturn("Movies list");


        LoginOption loginOption = new LoginOption(consoleInputOutput, library);



        loginOption.action(user, login, menuDispatcher);

        verify(login).loginWindow();


    }

}