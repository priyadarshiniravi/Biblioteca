//package com.twu.biblioteca;
//
//import org.mockito.Matchers;
//
//public class ReturnBook implements Options {
//    ConsoleInputOutput consoleInputOutput;
//    Books books;
//
//    public ReturnBook(ConsoleInputOutput consoleInputOutput, Books books) {
//        this.consoleInputOutput = consoleInputOutput;
//        this.books = books;
//    }
//
//    @Override
//    public void displayStrategy() {
//        String input = consoleInputOutput.getInputAsString();
//        boolean success=books.checkout(input);
//        if (success)
//        {
//            consoleInputOutput.print(Messages.SUCCESS_RETURN);
//        }
//        else
//            consoleInputOutput.print(Messages.UNSUCCESSFUL_RETURN);
//    }
//}
