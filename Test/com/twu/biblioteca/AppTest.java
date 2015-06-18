package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AppTest {

    @Test
    public void shouldDisplayWelcomeMessage() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        Menu menu = mock(Menu.class);
        Login login=mock(Login.class);
        App app = new App(consoleInputOutput, menu,login);

        app.start();

        verify(consoleInputOutput).print(Messages.WELCOME_MESSAGE);
    }

    @Test
    public void shouldCallLogin() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        Menu menu = mock(Menu.class);
        Login login=mock(Login.class);
        App app = new App(consoleInputOutput, menu,login);

        app.start();

        verify(login).loginWindow();
    }


}