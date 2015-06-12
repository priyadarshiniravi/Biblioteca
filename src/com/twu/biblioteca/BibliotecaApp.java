package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BibliotecaApp {
    public static void main(String args[])
    {   ConsoleInputOutput consoleInputOutput=new ConsoleInputOutput(new Scanner(System.in));
        HashMap<Integer, Options> menuOptions = new HashMap<>();
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("C++", "Jones", 1992));
        Books books = new Books(bookList);
        ListBooks listBooks=new ListBooks(consoleInputOutput, books);
        menuOptions.put(1, listBooks);
        Parser parser=new Parser(menuOptions);
        ArrayList<String> options=new ArrayList<>();
        options.add("Display Books");
        options.add("Exit");
        MenuOption menuOption=new MenuOption(options);
        Menu menu=new Menu(consoleInputOutput,parser,menuOption);
        Biblioteca biblioteca=new Biblioteca(consoleInputOutput,menu);
        biblioteca.start();
    }
}
