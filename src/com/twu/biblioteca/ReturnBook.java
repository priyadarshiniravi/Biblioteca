package com.twu.biblioteca;


public class ReturnBook implements Options {
    ConsoleInputOutput consoleInputOutput;
    Library library;

    public ReturnBook(ConsoleInputOutput consoleInputOutput, Library library) {
        this.consoleInputOutput = consoleInputOutput;
        this.library = library;
    }

    @Override
    public void action(User user) {
        String input = consoleInputOutput.getInputAsString();
        Book book = library.returnBook(input,user);
        consoleInputOutput.print(book.returnMessage());

    }
}
