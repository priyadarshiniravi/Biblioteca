package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class InvalidUserTest {
    @Test
    public void shouldReturnLoginMessage() {
        InvalidUser user = new InvalidUser(null, null, null, null, 0);

        String actualLoginMessage = user.loginMessage();

        assertEquals(Messages.UNSUCCESS_LOGIN, actualLoginMessage);

    }

    @Test
    public void shouldCallMenuDispatcher()
    {
        InvalidUser user = new InvalidUser("", "", "", "", 0);
        MenuDispatcher menuDispatcher=mock(MenuDispatcher.class);

        user.dispatchMenu(menuDispatcher);

        verify(menuDispatcher).callMenu(user);


    }

}