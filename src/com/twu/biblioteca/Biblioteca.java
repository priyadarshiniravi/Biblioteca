package com.twu.biblioteca;

import java.util.Scanner;

public class Biblioteca {
    ConsoleInputOutput consoleInputOutput;

    public Biblioteca(ConsoleInputOutput consoleInputOutput) {
        this.consoleInputOutput = consoleInputOutput;
    }

    public void start() {
        consoleInputOutput.print(Messages.WELCOME_MESSAGE);


    }
}
