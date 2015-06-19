package com.twu.biblioteca;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibrarianUserTest {
    @Test
    public void shouldReturnLoginMessage() {
        ValidUser user = new ValidUser("3333-333", "password", "ishika", "emailid@gmail.com", 99857969);

        String actualLoginMessage = user.loginMessage();

        assertEquals(Messages.SUCCESS_LOGIN, actualLoginMessage);

    }

}