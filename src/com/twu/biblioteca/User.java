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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (phoneNumber != user.phoneNumber) return false;
        if (Id != null ? !Id.equals(user.Id) : user.Id != null) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (emailId != null ? !emailId.equals(user.emailId) : user.emailId != null) return false;
        return !(password != null ? !password.equals(user.password) : user.password != null);

    }

    @Override
    public int hashCode() {
        int result = Id != null ? Id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (emailId != null ? emailId.hashCode() : 0);
        result = 31 * result + (int) (phoneNumber ^ (phoneNumber >>> 32));
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    public abstract String loginMessage();

    public abstract int dispatchMenu(MenuDispatcher menuDispatcher);
}
