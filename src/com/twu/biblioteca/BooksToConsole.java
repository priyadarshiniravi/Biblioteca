package com.twu.biblioteca;

public class BooksToConsole {

    Books books;
    BooksToConsole(Books books)
    {
        this.books=books;
    }

    public void displayBookList()
    {
        System.out.println(books.toString());
    }
}
