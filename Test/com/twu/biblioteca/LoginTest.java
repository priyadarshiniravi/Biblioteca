package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class LoginTest {
    @Test
    public void shouldTakeInUserName() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        when(consoleInputOutput.getInputAsString())
                .thenReturn("priya");
        Users users=mock(Users.class);
        Login login =new Login(users,consoleInputOutput);

        login.loginWindow();

        verify(consoleInputOutput).getInputAsString();
    }


}