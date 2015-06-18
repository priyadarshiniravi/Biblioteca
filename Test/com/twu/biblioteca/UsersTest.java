package com.twu.biblioteca;

import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class UsersTest {
    @Test
    public void shouldSearchTheAvailableUser() {
        HashSet<User> listOfUsers = new HashSet<>();
        ValidUser validUser = new ValidUser("9999-999", "priyar", "priya", "priya@gmail.com", 24714844);
        listOfUsers.add(validUser);
        listOfUsers.add(new ValidUser("9999-998", "achu", "aswini", "achu@gmail.com", 24714845));
        listOfUsers.add(new ValidUser("9999-997", "maddy", "madhu", "maddy@gmail.com", 24714846));
        Users users = new Users(listOfUsers);

        User actualUser = users.login("9999-999", "priyar");

        assertEquals(validUser, actualUser);


    }

    @Test
    public void shouldReturnInvalidUserWhenSearchForInvalidUser() {
        HashSet<User> listOfUsers = new HashSet<>();
        ValidUser validUser = new ValidUser("9999-999", "priyar", "priya", "priya@gmail.com", 24714844);
        listOfUsers.add(validUser);
        listOfUsers.add(new ValidUser("9999-998", "achu", "aswini", "achu@gmail.com", 24714845));
        listOfUsers.add(new ValidUser("9999-997", "maddy", "madhu", "maddy@gmail.com", 24714846));
        Users users = new Users(listOfUsers);

        User actualUser = users.login("iiii", "priya");
        InvalidUser expectedUser = new InvalidUser("", "", "", "", 0);

        assertEquals(expectedUser, actualUser);

    }

}