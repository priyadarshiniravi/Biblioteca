package com.twu.biblioteca;


public class ReturnMovie implements Options {
    ConsoleInputOutput consoleInputOutput;
    Library library;

    public ReturnMovie(ConsoleInputOutput consoleInputOutput, Library library) {
        this.consoleInputOutput = consoleInputOutput;
        this.library = library;
    }

    @Override
    public void action(User user,Login login,MenuDispatcher menuDispatcher) {
        String input = consoleInputOutput.getInputAsString();
        Movie book = library.returnMovie(input,user);
        consoleInputOutput.print(book.returnMessage());

    }
}

