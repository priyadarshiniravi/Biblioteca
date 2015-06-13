package com.twu.biblioteca;

public class CheckoutBook implements Options {
    ConsoleInputOutput consoleInputOutput;
    Books books;

    public CheckoutBook(ConsoleInputOutput consoleInputOutput, Books books) {
        this.consoleInputOutput = consoleInputOutput;
        this.books = books;
    }

    @Override
    public void displayStrategy() {
        String input = consoleInputOutput.getInputAsString();
    }
}
