package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class EntryPoint {
    public static void main(String args[]) {
        ConsoleInputOutput consoleInputOutput = new ConsoleInputOutput(new Scanner(System.in));
        HashMap<Integer, Options> menuOptions = new HashMap<>();
        HashSet<Book> bookList = new HashSet<>();
        AvailableBook bookone = new AvailableBook("C++", "Jones", 1992);
        bookList.add(bookone);
        AvailableBook booktwo = new AvailableBook("Java", "Charles", 1993);
        bookList.add(booktwo);
        CheckedOutBook bookthree = new CheckedOutBook("J2EE", "Charles", 1993);
        bookList.add(bookthree);
        HashSet<Movie> movies=new HashSet<>();
        AvailableMovie movieOne=new AvailableMovie("Movie",1888,"XYZ",10);
        AvailableMovie movieTwo=new AvailableMovie("Movie123",1888,"XYZ",10);
        CheckedOutMovie movieThree=new CheckedOutMovie("Movie555",1888,"XYZ",10);
        movies.add(movieOne);
        movies.add(movieTwo);
        movies.add(movieThree);

        BooksPresenter booksPresenter=new BooksPresenter("");
        MoviesPresenter moviesPresenter=new MoviesPresenter("");
        Library library = new Library(bookList, movies, booksPresenter, moviesPresenter);
        ListBooks listBooks = new ListBooks(consoleInputOutput, library);
        ConsoleInputOutput consoleInputOutput1 = new ConsoleInputOutput(new Scanner(System.in));
        CheckoutOptionBook checkoutbook = new CheckoutOptionBook(consoleInputOutput1, library);
        CheckoutOptionMovie checkoutmovie = new CheckoutOptionMovie(consoleInputOutput1, library);
        ReturnBook returnBook = new ReturnBook(consoleInputOutput1, library);
        menuOptions.put(1, listBooks);
        menuOptions.put(3, checkoutbook);
        menuOptions.put(4, returnBook);
        menuOptions.put(5,checkoutmovie);
        Parser parser = new Parser(menuOptions);
        ArrayList<String> options = new ArrayList<>();
        options.add("Display Books");
        options.add("Exit");
        options.add("Checkout");
        options.add("Return");
        options.add("Checkout Movie");
        MenuOption menuOption = new MenuOption(options);
        Menu menu = new Menu(consoleInputOutput, parser, menuOption);
        App app = new App(consoleInputOutput, menu);
        app.start();
    }
}
