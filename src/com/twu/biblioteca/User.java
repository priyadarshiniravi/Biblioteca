package com.twu.biblioteca;

public abstract class User {
    protected String Id;
    protected String name;
    protected String emailId;
    protected long phoneNumber;
    protected String password;

    public User(String id, String password, String name, String emailId, long phoneNumber) {
        Id = id;
        this.name = name;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }


    public boolean matchUser(String userName, String password) {
        if (userName == null || password == null) {
            return false;
        }
        return (this.name.equals(name) && (this.password.equals(password)));
    }
}
