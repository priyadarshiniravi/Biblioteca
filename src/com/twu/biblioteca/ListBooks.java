package com.twu.biblioteca;

public class ListBooks implements MenuListener {
    BooksToConsole booksToConsole;
    ListBooks(BooksToConsole booksToConsole)
    {
        this.booksToConsole=booksToConsole;
    }


    @Override
    public void displayStrategy() {
        booksToConsole.displayBookList();

    }
}