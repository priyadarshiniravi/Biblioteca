package com.twu.biblioteca;

public class Login {
    private Users users;
    private ConsoleInputOutput consoleInputOutput;

    public Login(Users users, ConsoleInputOutput consoleInputOutput) {
        this.users = users;
        this.consoleInputOutput = consoleInputOutput;
    }

    public User loginWindow() {
        User user;
        consoleInputOutput.print("LOGIN CREDENTIALS");
        consoleInputOutput.getInputAsString();
        String username = consoleInputOutput.getInputAsString();
        String password = consoleInputOutput.getInputAsString();
        user = users.login(username, password);
        consoleInputOutput.print(user.loginMessage());
        consoleInputOutput.print(user.InformationString());
        return user;

    }
}
