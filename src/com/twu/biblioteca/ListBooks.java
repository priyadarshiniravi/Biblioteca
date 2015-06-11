package com.twu.biblioteca;

public class ListBooks implements Options {
    ConsoleInputOutput consoleInputOutput;
    Books books;

    public ListBooks(ConsoleInputOutput consoleInputOutput, Books books) {
        this.consoleInputOutput = consoleInputOutput;
        this.books = books;
    }

    @Override
    public void displayStrategy() {
        consoleInputOutput.print(books.toString());

    }
}
