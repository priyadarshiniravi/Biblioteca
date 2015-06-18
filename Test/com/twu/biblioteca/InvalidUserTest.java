package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InvalidUserTest {
    @Test
    public void shouldReturnLoginMessage() {
        InvalidUser user = new InvalidUser(null, null, null, null, 0);

        String actualLoginMessage = user.loginMessage();

        assertEquals(Messages.UNSUCCESS_LOGIN, actualLoginMessage);

    }

}