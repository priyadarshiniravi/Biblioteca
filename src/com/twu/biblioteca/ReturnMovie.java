package com.twu.biblioteca;


public class ReturnMovie implements Options {
    ConsoleInputOutput consoleInputOutput;
    Library library;

    public ReturnMovie(ConsoleInputOutput consoleInputOutput, Library library) {
        this.consoleInputOutput = consoleInputOutput;
        this.library = library;
    }

    @Override
    public void action() {
        String input = consoleInputOutput.getInputAsString();
        Movie book = library.returnMovie(input);
        consoleInputOutput.print(book.returnMessage());

    }
}

