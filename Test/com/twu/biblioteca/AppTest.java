package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class AppTest {

    @Test
    public void shouldDisplayWelcomeMessage() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        Menu menu = mock(Menu.class);
        Login login=mock(Login.class);
        MenuDispatcher menuDispatcher=mock(MenuDispatcher.class);
        when(login.loginWindow())
                .thenReturn(new ValidUser("","","","",99999));
        when(menu.exitOptionInMenu())
                .thenReturn(2);
        when(login.loginWindow().dispatchMenu(menuDispatcher))
                .thenReturn(1,2);
        App app = new App(consoleInputOutput, menu,login, menuDispatcher);


        app.start();

        verify(consoleInputOutput,times(1)).print(Messages.WELCOME_MESSAGE);
    }

    @Test
    public void shouldCallLogin() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        Menu menu = mock(Menu.class);
        Login login=mock(Login.class);
        when(menu.exitOptionInMenu())
                .thenReturn(2);
        MenuDispatcher menuDispatcher=mock(MenuDispatcher.class);
        when(login.loginWindow())
                .thenReturn(new ValidUser("","","","",99999));
        when(login.loginWindow().dispatchMenu(menuDispatcher))
                .thenReturn(1,2);
        App app = new App(consoleInputOutput, menu,login, menuDispatcher);

        app.start();

        verify(login,times(2)).loginWindow();
    }


}