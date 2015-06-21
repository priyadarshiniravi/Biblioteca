package com.twu.biblioteca;

public class ListCheckedOutMovie implements Options{
    ConsoleInputOutput consoleInputOutput;
    Library library;

    public ListCheckedOutMovie(ConsoleInputOutput consoleInputOutput, Library library) {
        this.consoleInputOutput = consoleInputOutput;
        this.library = library;
    }

    @Override
    public void action(User user,Login login,MenuDispatcher menuDispatcher) {
        consoleInputOutput.print(library.formattedCheckedOutMovieString());

    }
}

