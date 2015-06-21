package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class UserInformationTest {
    @Test
    public void shouldCheckBookDisplayStrategy() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        Library library = mock(Library.class);
        Login login=mock(Login.class);
        MenuDispatcher menuDispatcher=mock(MenuDispatcher.class);

        UserInformation userInformation = new UserInformation(consoleInputOutput, library);
        User user = mock(User.class);
        when(user.InformationString())
                .thenReturn("User Information");

        userInformation.action(user,login,menuDispatcher);

        verify(consoleInputOutput).print("User Information");


    }

}