package com.twu.biblioteca;

public class Login {
    private Users users;
    private ConsoleInputOutput consoleInputOutput;

    public Login(Users users, ConsoleInputOutput consoleInputOutput) {
        this.users = users;
        this.consoleInputOutput = consoleInputOutput;
    }

    public void loginWindow() {
        String username = consoleInputOutput.getInputAsString();
        String password = consoleInputOutput.getInputAsString();

    }
}
