package com.twu.biblioteca;


public class CheckoutOption implements Options {
    ConsoleInputOutput consoleInputOutput;
    Library library;

    public CheckoutOption(ConsoleInputOutput consoleInputOutput, Library library) {
        this.consoleInputOutput = consoleInputOutput;
        this.library = library;
    }

    @Override
    public void action() {
        String input = consoleInputOutput.getInputAsString();
        boolean success = library.checkout(input);
        if (success) {
            consoleInputOutput.print(Messages.SUCCESS_CHECKOUT);
        } else
            consoleInputOutput.print(Messages.UNSUCCESS_CHECKOUT);
    }
}
