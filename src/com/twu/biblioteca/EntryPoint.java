package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
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

        HashMap<Book,Boolean> booksDetail=new HashMap<>();
        booksDetail.put(bookone,true);
        booksDetail.put(booktwo,false);

        Books books = new Books(booksDetail);
        ListBooks listBooks = new ListBooks(consoleInputOutput, books);
        menuOptions.put(1, listBooks);
        Parser parser = new Parser(menuOptions);
        ArrayList<String> options = new ArrayList<>();
        options.add("Display Books");
        options.add("Exit");
        MenuOption menuOption = new MenuOption(options);
        Menu menu = new Menu(consoleInputOutput, parser, menuOption);
        App app = new App(consoleInputOutput, menu);
        app.start();
    }
}
