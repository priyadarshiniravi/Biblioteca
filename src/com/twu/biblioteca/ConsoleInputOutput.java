package com.twu.biblioteca;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleInputOutput {
    private Scanner consoleInput;

    public ConsoleInputOutput(Scanner consoleInput) {
        this.consoleInput = consoleInput;
    }

    public int getInputAsNumber() {
        try {
            return consoleInput.nextInt();
        } catch (InputMismatchException e) {
            consoleInput.nextLine();
            return -1;
        }
    }

    public String getInputAsString() {
        String input = consoleInput.nextLine();
        return input;
    }

    public void print(String output) {
        System.out.println(output);

    }
}
