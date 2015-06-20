package com.twu.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class UserTest {
    @Test
    public void shouldMatchUser() {
        ValidUser user = new ValidUser("3333-333", "password", "name", "emailid@gmail.com", 99857969);

        boolean actualMatch = user.matchUser("3333-333", "password");

        assertEquals(true, actualMatch);

    }

    @Test
    public void equalityShouldSatisfyReflexivity() {
        ValidUser validUser = new ValidUser("3333-333", "password", "name", "emailid@gmail.com", 99857969);

        assertThat(validUser, is(equalTo(validUser)));
    }

    @Test
    public void equalityShouldSatisfySymmetricity() {
        ValidUser validUser = new ValidUser("3333-333", "password", "name", "emailid@gmail.com", 99857969);
        ValidUser OtherValidUser = new ValidUser("3333-333", "password", "name", "emailid@gmail.com", 99857969);

        assertThat(validUser, is(equalTo(OtherValidUser)));
        assertThat(OtherValidUser, is(equalTo(validUser)));
    }

    @Test
    public void equalityShouldSatisfyTransitivity() {
        ValidUser validUser = new ValidUser("3333-333", "password", "name", "emailid@gmail.com", 99857969);
        ValidUser validUserTwo = new ValidUser("3333-333", "password", "name", "emailid@gmail.com", 99857969);
        ValidUser validUserThree = new ValidUser("3333-333", "password", "name", "emailid@gmail.com", 99857969);

        assertThat(validUser, is(equalTo(validUserTwo)));
        assertThat(validUserTwo, is(equalTo(validUserThree)));
        assertThat(validUser, is(equalTo(validUserThree)));
    }

    @Test
    public void equalityShouldReturnFalseOnPassingNull() {
        ValidUser validUser = new ValidUser("3333-333", "password", "name", "emailid@gmail.com", 99857969);

        assertFalse(validUser.equals(null));
    }

    @Test
    public void equalityShouldReturnFalseOnPassingOtherObject() {
        ValidUser validUser = new ValidUser("3333-333", "password", "name", "emailid@gmail.com", 99857969);

        assertFalse(validUser.equals(new String("Hello, World")));
    }

    @Test
    public void whenTwoObjectsAreEqualThenTheirHashCodeMustBeEqual() {
        ValidUser validUser = new ValidUser("3333-333", "password", "name", "emailid@gmail.com", 99857969);
        ValidUser validUserOther = new ValidUser("3333-333", "password", "name", "emailid@gmail.com", 99857969);

        assertThat(validUser, is(equalTo(validUserOther)));
        assertThat(validUser.hashCode(), is(equalTo(validUserOther.hashCode())));
    }

    @Test
    public void shouldBeUserInformation() {
        ValidUser validUser = new ValidUser("3333-333", "password", "name", "emailid@gmail.com", 99857969);

        String actualInformation=validUser.InformationString();

        Assert.assertEquals("id=3333-333, name=name, emailId=emailid@gmail.com, phoneNumber=99857969, password=password",actualInformation);

    }


}