package com.twu.biblioteca;


public class CheckoutOptionBook implements Options {
    ConsoleInputOutput consoleInputOutput;
    Library library;

    public CheckoutOptionBook(ConsoleInputOutput consoleInputOutput, Library library) {
        this.consoleInputOutput = consoleInputOutput;
        this.library = library;
    }

    @Override
    public void action() {
        String input = consoleInputOutput.getInputAsString();
        Book book = library.checkoutBook(input);
        consoleInputOutput.print(book.checkoutMessage());
    }
}
