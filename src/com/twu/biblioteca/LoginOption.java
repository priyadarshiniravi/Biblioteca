package com.twu.biblioteca;

public class LoginOption implements Options {
    ConsoleInputOutput consoleInputOutput;
    Library library;

    public LoginOption(ConsoleInputOutput consoleInputOutput, Library library) {
        this.consoleInputOutput = consoleInputOutput;
        this.library = library;
    }

    @Override
    public void action(User user,Login login,MenuDispatcher menuDispatcher) {
        user = login.loginWindow();
        int option=user.dispatchMenu(menuDispatcher, login);
        if(option==2)
        {
            System.exit(0);
        }

    }
}
