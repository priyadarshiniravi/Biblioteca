package com.twu.biblioteca;

public class ValidUser extends User {


    public ValidUser(String id, String password, String name, String emailId, long phoneNumber) {
        super(id, password, name, emailId, phoneNumber);
    }
    public String loginMessage() {
        return Messages.SUCCESS_LOGIN;

    }

    public int dispatchMenu(MenuDispatcher menuDispatcher,Login login)
    {
        return menuDispatcher.callMenu(this,login,menuDispatcher);
    }

    public String InformationString() {
        return "id=" + id +
                ", name=" + name  +
                ", emailId=" + emailId +
                ", phoneNumber=" + phoneNumber +
                ", password=" + password ;
    }

    @Override
    public String toString() {
        return this.id+" "+this.name;
    }
}
