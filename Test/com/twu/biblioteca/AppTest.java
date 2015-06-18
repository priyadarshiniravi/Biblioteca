package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class AppTest {

    @Test
    public void shouldDisplayWelcomeMessage() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        Menu menu = mock(Menu.class);
        Login login=mock(Login.class);
        MenuDispatcher menuDispatcher=mock(MenuDispatcher.class);
        when(login.loginWindow())
                .thenReturn(new ValidUser("","","","",99999));
        App app = new App(consoleInputOutput, menu,login, menuDispatcher);


        app.start();

        verify(consoleInputOutput).print(Messages.WELCOME_MESSAGE);
    }

    @Test
    public void shouldCallLogin() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        Menu menu = mock(Menu.class);
        Login login=mock(Login.class);
        MenuDispatcher menuDispatcher=mock(MenuDispatcher.class);
        when(login.loginWindow())
                .thenReturn(new ValidUser("","","","",99999));
        App app = new App(consoleInputOutput, menu,login, menuDispatcher);

        app.start();

        verify(login).loginWindow();
    }


}