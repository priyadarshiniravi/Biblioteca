package com.twu.biblioteca;

public class Biblioteca {
    ConsoleInputOutput consoleInputOutput;
    Menu menu;


    public Biblioteca(ConsoleInputOutput consoleInputOutput, Menu menu) {
        this.consoleInputOutput = consoleInputOutput;
        this.menu=menu;
    }

    public void start() {
        consoleInputOutput.print(Messages.WELCOME_MESSAGE);
        menu.chooseOption();



    }
}