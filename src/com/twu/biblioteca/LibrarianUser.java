package com.twu.biblioteca;

public class LibrarianUser extends User {
    public LibrarianUser(String id, String password, String name, String emailId, long phoneNumber) {
        super(id, password, name, emailId, phoneNumber);
    }

    @Override
    public String loginMessage() {
        return Messages.SUCCESS_LOGIN;
    }

    @Override
    public int dispatchMenu(MenuDispatcher menuDispatcher,Login login) {
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
