package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class LoginTest {
    @Test
    public void shouldTakeInUserNameAndPassword() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        when(consoleInputOutput.getInputAsString())
                .thenReturn("9999-999", "priyar");
        Users users = mock(Users.class);
        when(users.login("9999-999", "priyar"))
                .thenReturn(new ValidUser("9999-999", "priyar", "priya", "priya@gmail.com", 24714844));
        Login login = new Login(users, consoleInputOutput);

        login.loginWindow();

        verify(consoleInputOutput, times(2)).getInputAsString();
    }

    @Test
    public void shouldLoginOnlyForValidUser() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        when(consoleInputOutput.getInputAsString())
                .thenReturn("9999-999", "priyar");
        Users users = mock(Users.class);
        when(users.login("9999-999", "priyar"))
                .thenReturn(new ValidUser("9999-999", "priyar", "priya", "priya@gmail.com", 24714844));
        Login login = new Login(users, consoleInputOutput);

        login.loginWindow();

        verify(users, times(1)).login(anyString(), anyString());

    }


}