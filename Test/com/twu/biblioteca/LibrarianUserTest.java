package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibrarianUserTest {
    @Test
    public void shouldReturnLoginMessage() {
        LibrarianUser user = new LibrarianUser("3333-333", "password", "ishika", "emailid@gmail.com", 99857969);

        String actualLoginMessage = user.loginMessage();

        assertEquals(Messages.SUCCESS_LOGIN, actualLoginMessage);

    }

}