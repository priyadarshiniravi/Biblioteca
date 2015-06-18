package com.twu.biblioteca;

public class App {
    ConsoleInputOutput consoleInputOutput;
    Menu menu;
    Login login;


    public App(ConsoleInputOutput consoleInputOutput, Menu menu, Login login) {
        this.consoleInputOutput = consoleInputOutput;
        this.menu = menu;
        this.login = login;
    }

    public void start() {
        consoleInputOutput.print(Messages.WELCOME_MESSAGE);
        User user=login.loginWindow();
        menu.chooseOption();


    }
}
