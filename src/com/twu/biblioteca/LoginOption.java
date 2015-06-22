package com.twu.biblioteca;

public class LoginOption implements Options {
    ConsoleInputOutput consoleInputOutput;
    Library library;
    int EXIT_OPTION=2;

    public LoginOption(ConsoleInputOutput consoleInputOutput, Library library) {
        this.consoleInputOutput = consoleInputOutput;
        this.library = library;
    }

    @Override
    public void action(User user,Login login,MenuDispatcher menuDispatcher) {
        user = login.loginWindow();
        int option=user.dispatchMenu(menuDispatcher, login);
        if(option==EXIT_OPTION)
        {
            System.exit(0);
        }

    }
}
