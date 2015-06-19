package com.twu.biblioteca;

public class App {
    ConsoleInputOutput consoleInputOutput;
    Menu menu;
    Login login;
    private MenuDispatcher menuDispatcher;


    public App(ConsoleInputOutput consoleInputOutput, Menu menu, Login login, MenuDispatcher menuDispatcher) {
        this.consoleInputOutput = consoleInputOutput;
        this.menu = menu;
        this.login = login;
        this.menuDispatcher = menuDispatcher;
    }

    public void start() {
        User user;
        int option;

        do {
            consoleInputOutput.print(Messages.WELCOME_MESSAGE);
            user = login.loginWindow();
            option = user.dispatchMenu(menuDispatcher);

        }
        while (option != 2);


    }
}
