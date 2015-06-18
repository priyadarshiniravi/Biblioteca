package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ValidUserTest {
    @Test
    public void shouldReturnLoginMessage() {
        ValidUser user = new ValidUser("3333-333", "password", "name", "emailid@gmail.com", 99857969);

        String actualLoginMessage=user.loginMessage();

        assertEquals(Messages.SUCCESS_LOGIN,actualLoginMessage);

    }

    @Test
    public void shouldCallMenuDispatcher()
    {
        ValidUser user = new ValidUser("3333-333", "password", "name", "emailid@gmail.com", 99857969);
        MenuDispatcher menuDispatcher=mock(MenuDispatcher.class);

        user.dispatchmenu(menuDispatcher);

        verify(menuDispatcher).callMenu(user);


    }
}