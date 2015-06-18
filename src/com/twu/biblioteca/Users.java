package com.twu.biblioteca;

import java.util.HashSet;

public class Users {
    HashSet<User> users;

    public Users(HashSet<User> users) {
        this.users = users;
    }

    public User login(String userName, String password) {
        return search(userName,password);

    }

    private User search(String UserId, String password) {
        for (User user : users) {
            if (user.matchUser(UserId, password)) {
                return user;
            }
        }
        return new InvalidUser("","","","",0);
    }


}
