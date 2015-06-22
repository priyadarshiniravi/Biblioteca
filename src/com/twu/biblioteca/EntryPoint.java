package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class EntryPoint {
    public static void main(String args[]) {
        ConsoleInputOutput consoleInputOutput = new ConsoleInputOutput(new Scanner(System.in));
        HashMap<Integer, Options> menuOptionsValiduser = new HashMap<>();
        HashMap<Integer, Options> menuOptionsInvaliduser = new HashMap<>();
        HashMap<Integer, Options> menuOptionsLibrarianuser = new HashMap<>();

        HashSet<Book> bookList = new HashSet<>();
        AvailableBook bookone = new AvailableBook("C++", "Jones", 1992);
        bookList.add(bookone);
        AvailableBook booktwo = new AvailableBook("Java", "Charles", 1993);
        bookList.add(booktwo);
        ValidUser validUser = new ValidUser("9999-999", "priyar", "priya", "priya@gmail.com", 24714844);
        CheckedOutBook bookthree = new CheckedOutBook("J2EE", "Charles", 1993, validUser);
        bookList.add(bookthree);
        HashSet<Movie> movies = new HashSet<>();
        AvailableMovie movieOne = new AvailableMovie("Movie", 1888, "XYZ", 10);
        AvailableMovie movieTwo = new AvailableMovie("Movie123", 1888, "XYZ", 10);
        CheckedOutMovie movieThree = new CheckedOutMovie("Movie555", 1888, "XYZ", 10,validUser);
        movies.add(movieOne);
        movies.add(movieTwo);
        movies.add(movieThree);

        BooksPresenter booksPresenter = new BooksPresenter("");
        MoviesPresenter moviesPresenter = new MoviesPresenter("");
        Library library = new Library(bookList, movies, booksPresenter, moviesPresenter);
        ListBooks listBooks = new ListBooks(consoleInputOutput, library);
        ConsoleInputOutput consoleInputOutput1 = new ConsoleInputOutput(new Scanner(System.in));
        CheckoutOptionBook checkoutbook = new CheckoutOptionBook(consoleInputOutput1, library);
        CheckoutOptionMovie checkoutmovie = new CheckoutOptionMovie(consoleInputOutput1, library);
        ReturnMovie returnMovie = new ReturnMovie(consoleInputOutput1, library);
        ListMovie listMovie = new ListMovie(consoleInputOutput1, library);
        ListCheckedOutBook listCheckedOutBook = new ListCheckedOutBook(consoleInputOutput1, library);
        ListCheckedOutMovie listCheckedOutMovie = new ListCheckedOutMovie(consoleInputOutput1, library);
        ReturnBook returnBook = new ReturnBook(consoleInputOutput1, library);
        LoginOption loginOption=new LoginOption(consoleInputOutput1,library);
        menuOptionsValiduser.put(1, listBooks);
        menuOptionsValiduser.put(3, checkoutbook);
        menuOptionsValiduser.put(4, returnBook);
        menuOptionsValiduser.put(5, listMovie);
        menuOptionsValiduser.put(6, checkoutmovie);
        menuOptionsValiduser.put(7, returnMovie);
        Parser parser = new Parser(menuOptionsValiduser);
        ArrayList<String> options = new ArrayList<>();
        options.add("Display Books");
        options.add("Exit");
        options.add("Checkout");
        options.add("Return");
        options.add("List Movie");
        options.add("Checkout Movie");
        options.add("Return Movie");
        options.add("Logout");
        MenuOption menuOptionValid = new MenuOption(options);
        Menu menuValidUser = new Menu(consoleInputOutput, parser, menuOptionValid);

        menuOptionsInvaliduser.put(1, listBooks);
        menuOptionsInvaliduser.put(3, listMovie);
        menuOptionsInvaliduser.put(4,loginOption);

        ArrayList<String> optionsOne = new ArrayList<>();
        optionsOne.add("Display Books");
        optionsOne.add("Exit");
        optionsOne.add("List Movie");
        optionsOne.add("Login Option");
        Parser parser1 = new Parser(menuOptionsInvaliduser);

        MenuOption menuOptionInvalid = new MenuOption(optionsOne);
        Menu menuInValidUser = new Menu(consoleInputOutput, parser1, menuOptionInvalid);
        ArrayList<String> options3 = new ArrayList<>();
        options3.add("Display Books");
        options3.add("Exit");
        options3.add("Checkout");
        options3.add("Return");
        options3.add("List Movie");
        options3.add("Checkout Movie");
        options3.add("Return Movie");
        options3.add("list checked out book ");
        options3.add("List Checked out Movies");
        options3.add("Logout");
        MenuOption menuOptionLibrarian = new MenuOption(options3);


        menuOptionsLibrarianuser.put(1, listBooks);
        menuOptionsLibrarianuser.put(3, checkoutbook);
        menuOptionsLibrarianuser.put(4, returnBook);
        menuOptionsLibrarianuser.put(5, listMovie);
        menuOptionsLibrarianuser.put(6, checkoutmovie);
        menuOptionsLibrarianuser.put(7, returnMovie);
        menuOptionsLibrarianuser.put(8, listCheckedOutBook);
        menuOptionsLibrarianuser.put(9,listCheckedOutMovie);
        Parser parser3 = new Parser(menuOptionsLibrarianuser);

        Menu menuLibraryUser = new Menu(consoleInputOutput, parser3, menuOptionLibrarian);

        MenuDispatcher menuDispatcher = new MenuDispatcher(menuInValidUser, menuValidUser, menuLibraryUser);


        HashSet<User> listOfUsers = new HashSet<>();

        listOfUsers.add(validUser);
        listOfUsers.add(new LibrarianUser("9999-995", "ishika", "ishika", "ishi@gmail.com", 24714846));
        listOfUsers.add(new ValidUser("9999-998", "achu", "aswini", "achu@gmail.com", 24714845));
        listOfUsers.add(new ValidUser("9999-997", "maddy", "madhu", "maddy@gmail.com", 24714846));
        Users users = new Users(listOfUsers);
        Login login = new Login(users, consoleInputOutput);
        User nullUser= new InvalidUser("","","","",0);
        App app = new App(consoleInputOutput, menuValidUser, login, menuDispatcher, nullUser);
        app.start();
    }
}
