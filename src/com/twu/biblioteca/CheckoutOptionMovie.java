

package com.twu.biblioteca;

public class CheckoutOptionMovie implements Options {
    ConsoleInputOutput consoleInputOutput;
    Library library;

    public CheckoutOptionMovie(ConsoleInputOutput consoleInputOutput, Library library) {
        this.consoleInputOutput = consoleInputOutput;
        this.library = library;
    }

    @Override
    public void action(User user,Login login,MenuDispatcher menuDispatcher) {
        String input = consoleInputOutput.getInputAsString();
        Movie movie = library.checkoutMovie(input,user);
        consoleInputOutput.print(movie.checkoutMessage());
    }
}

