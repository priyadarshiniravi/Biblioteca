package com.twu.biblioteca;

public class InvalidUser extends User {


    public InvalidUser(String id, String password, String name, String emailId, long phoneNumber) {
        super(id, password, name, emailId, phoneNumber);
    }
    public String loginMessage() {
        return Messages.UNSUCCESS_LOGIN;

    }


}
