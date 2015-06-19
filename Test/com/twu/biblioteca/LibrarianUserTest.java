package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class LibrarianUserTest {
    @Test
    public void shouldReturnLoginMessage() {
        LibrarianUser user = new LibrarianUser("3333-333", "password", "ishika", "emailid@gmail.com", 99857969);

        String actualLoginMessage = user.loginMessage();

        assertEquals(Messages.SUCCESS_LOGIN, actualLoginMessage);

    }

    @Test
    public void shouldBeToString()
    {
        LibrarianUser user = new LibrarianUser("3333-333", "password", "ishika", "emailid@gmail.com", 99857969);
        MenuDispatcher menuDispatcher=mock(MenuDispatcher.class);

        String actualName=user.toString();

        assertEquals("3333-333 ishika",actualName);


    }

}