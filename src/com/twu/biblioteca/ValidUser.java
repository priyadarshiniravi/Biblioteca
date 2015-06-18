package com.twu.biblioteca;

public class ValidUser extends User {


    public ValidUser(String id, String password, String name, String emailId, long phoneNumber) {
        super(id, password, name, emailId, phoneNumber);
    }

    @Override
    public String loginMessage() {
        return Messages.SUCCESS_LOGIN;

    }


}
