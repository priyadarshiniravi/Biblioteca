package com.twu.biblioteca;

import java.util.Scanner;

public class ConsoleInputOutput {
    private Scanner consoleInput;

    public ConsoleInputOutput(Scanner consoleInput) {
        this.consoleInput = consoleInput;
    }

    public int getInputAsNumber() {

        int option = consoleInput.nextInt();
        return option;
    }

    public String getInputAsString() {
        String input=consoleInput.nextLine();
        return input;
    }

    public void print(String output) {
        System.out.println(output);

    }
}
