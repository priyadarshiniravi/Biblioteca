package com.twu.biblioteca;



public class CheckoutBook implements Options {
    ConsoleInputOutput consoleInputOutput;
    Books books;

    public CheckoutBook(ConsoleInputOutput consoleInputOutput, Books books) {
        this.consoleInputOutput = consoleInputOutput;
        this.books = books;
    }

    @Override
    public void action() {
        String input = consoleInputOutput.getInputAsString();
        boolean success=books.checkout(input);
        if (success)
        {
            consoleInputOutput.print(Messages.SUCCESS_CHECKOUT);
        }
        else
            consoleInputOutput.print(Messages.UNSUCCESS_CHECKOUT);
    }
}
