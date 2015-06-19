

package com.twu.biblioteca;

public class CheckoutOptionMovie implements Options {
    ConsoleInputOutput consoleInputOutput;
    Library library;

    public CheckoutOptionMovie(ConsoleInputOutput consoleInputOutput, Library library) {
        this.consoleInputOutput = consoleInputOutput;
        this.library = library;
    }

    @Override
    public void action(User user) {
        String input = consoleInputOutput.getInputAsString();
        Movie movie = library.checkoutMovie(input);
        consoleInputOutput.print(movie.checkoutMessage());
    }
}

