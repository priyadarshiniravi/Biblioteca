

package com.twu.biblioteca;


public class CheckoutOptionMovie implements Options {
    ConsoleInputOutput consoleInputOutput;
    Library library;

    public CheckoutOptionMovie(ConsoleInputOutput consoleInputOutput, Library library) {
        this.consoleInputOutput = consoleInputOutput;
        this.library = library;
    }

    @Override
    public void action() {
        String input = consoleInputOutput.getInputAsString();
    }
}

