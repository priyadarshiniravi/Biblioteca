package com.twu.biblioteca;

public class InvalidUser extends User {


    public InvalidUser(String id, String password, String name, String emailId, long phoneNumber) {
        super(id, password, name, emailId, phoneNumber);
    }

    @Override
    public String loginMessage() {
        return Messages.UNSUCCESS_LOGIN;

    }

    @Override
    public int dispatchMenu(MenuDispatcher menuDispatcher) {
        return menuDispatcher.callMenu(this);
    }

    @Override
    public String toString() {
        return "";
    }
}
