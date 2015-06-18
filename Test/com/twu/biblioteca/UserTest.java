package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {
    @Test
    public void shouldMatchUser() {
        ValidUser user = new ValidUser("3333-333", "password", "name", "emailid@gmail.com", 99857969);

        boolean actualMatch = user.matchUser("3333-333", "password");

        assertEquals(true, actualMatch);

    }

}