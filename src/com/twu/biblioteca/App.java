package com.twu.biblioteca;

public class App {
    ConsoleInputOutput consoleInputOutput;
    Menu menu;
    Login login;
    private MenuDispatcher menuDispatcher;
    private User user;


    public App(ConsoleInputOutput consoleInputOutput, Menu menu, Login login, MenuDispatcher menuDispatcher, User user) {
        this.consoleInputOutput = consoleInputOutput;
        this.menu = menu;
        this.login = login;
        this.menuDispatcher = menuDispatcher;

        this.user = user;
    }

    public void start() {
        User user;
        int option;

        do {
            consoleInputOutput.print(Messages.WELCOME_MESSAGE);
            option = this.user.dispatchMenu(menuDispatcher, login);

        }
        while (menu.exitOptionInMenu() != option);


    }
}
