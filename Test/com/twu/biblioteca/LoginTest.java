package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class LoginTest {
    @Test
    public void shouldTakeInUserNameAndPassword() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        when(consoleInputOutput.getInputAsString())
                .thenReturn("priya","priya123");
        Users users=mock(Users.class);
        Login login =new Login(users,consoleInputOutput);

        login.loginWindow();

        verify(consoleInputOutput,times(2)).getInputAsString();
    }




}