package com.twu.biblioteca;

import java.util.Scanner;

public class ConsoleInputOutput {
    private Scanner consoleInput;

    public ConsoleInputOutput(Scanner consoleInput) {
        this.consoleInput = consoleInput;
    }


    public int getInput() {

        int option = consoleInput.nextInt();
        return option;
    }
}
