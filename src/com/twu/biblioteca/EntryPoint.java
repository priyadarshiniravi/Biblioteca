package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class EntryPoint {
    public static void main(String args[]) {
        ConsoleInputOutput consoleInputOutput = new ConsoleInputOutput(new Scanner(System.in));
        HashMap<Integer, Options> menuOptions = new HashMap<>();
        ArrayList<Book> bookList = new ArrayList<>();
        Book bookone = new Book("C++", "Jones", 1992);
        bookList.add(bookone);
        Book booktwo = new Book("Java", "Charles", 1993);
        bookList.add(booktwo);
        Book bookthree = new Book("J2EE", "Charles", 1993);
        bookList.add(bookthree);

        LinkedHashMap<Book, Boolean> booksDetail = new LinkedHashMap<>();
        booksDetail.put(bookone, true);
        booksDetail.put(booktwo, false);
        booksDetail.put(bookthree, true);
        BookParser bookParser = new BookParser();
        Library library = new Library(booksDetail, bookParser);
        ListBooks listBooks = new ListBooks(consoleInputOutput, library);
        ConsoleInputOutput consoleInputOutput1 = new ConsoleInputOutput(new Scanner(System.in));
        CheckoutBook checkoutbook = new CheckoutBook(consoleInputOutput1, library);
        ReturnBook returnBook = new ReturnBook(consoleInputOutput1, library);
        menuOptions.put(1, listBooks);
        menuOptions.put(3, checkoutbook);
        menuOptions.put(4, returnBook);
        Parser parser = new Parser(menuOptions);
        ArrayList<String> options = new ArrayList<>();
        options.add("Display Books");
        options.add("Exit");
        options.add("Checkout");
        options.add("Return");
        MenuOption menuOption = new MenuOption(options);
        Menu menu = new Menu(consoleInputOutput, parser, menuOption);
        App app = new App(consoleInputOutput, menu);
        app.start();
    }
}
