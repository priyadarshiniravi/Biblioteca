package com.twu.biblioteca;

public class ListMovie implements Options {
    ConsoleInputOutput consoleInputOutput;
    Library library;

    public ListMovie(ConsoleInputOutput consoleInputOutput, Library library) {
        this.consoleInputOutput = consoleInputOutput;
        this.library = library;
    }

    @Override
    public void action() {
        consoleInputOutput.print(library.formattedMovieString());

    }
}