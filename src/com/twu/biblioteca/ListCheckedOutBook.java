package com.twu.biblioteca;

public class ListCheckedOutBook implements Options {
    ConsoleInputOutput consoleInputOutput;
    Library library;

    public ListCheckedOutBook(ConsoleInputOutput consoleInputOutput, Library library) {
        this.consoleInputOutput = consoleInputOutput;
        this.library = library;
    }

    @Override
    public void action(User user,Login login,MenuDispatcher menuDispatcher) {
        consoleInputOutput.print(library.formattedCheckoutBookString());

    }
}