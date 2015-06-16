package com.twu.biblioteca;

public class ListBooks implements Options {
    ConsoleInputOutput consoleInputOutput;
    Library library;

    public ListBooks(ConsoleInputOutput consoleInputOutput, Library library) {
        this.consoleInputOutput = consoleInputOutput;
        this.library = library;
    }

    @Override
    public void action() {
        consoleInputOutput.print(library.formattedBookString());

    }
}
