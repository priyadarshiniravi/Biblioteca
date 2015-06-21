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
        Login login=mock(Login.class);

        user.dispatchMenu(menuDispatcher,login);

        verify(menuDispatcher).callMenu(user,login);


    }

    @Test
    public void shouldBeToString()
    {
        ValidUser user = new ValidUser("3333-333", "password", "ishika", "emailid@gmail.com", 99857969);
        MenuDispatcher menuDispatcher=mock(MenuDispatcher.class);

        String actualName=user.toString();

       assertEquals("3333-333 ishika",actualName);


    }
}