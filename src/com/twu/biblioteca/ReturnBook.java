package com.twu.biblioteca;


public class ReturnBook implements Options {
    ConsoleInputOutput consoleInputOutput;
    Library library;

    public ReturnBook(ConsoleInputOutput consoleInputOutput, Library library) {
        this.consoleInputOutput = consoleInputOutput;
        this.library = library;
    }

    @Override
    public void action() {
        String input = consoleInputOutput.getInputAsString();
        boolean success = library.returnBook(input);
        if (success) {
            consoleInputOutput.print(Messages.SUCCESS_RETURN);
        } else
            consoleInputOutput.print(Messages.UNSUCCESSFUL_RETURN);
    }
}
