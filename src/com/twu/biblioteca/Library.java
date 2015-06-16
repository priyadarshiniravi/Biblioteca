package com.twu.biblioteca;


import java.util.ArrayList;

public class Library {
    private ArrayList<Book> availableBooks;
    private ArrayList<Book> checkoutBooks;


    public Library(ArrayList<Book> availableBooks, ArrayList<Book> checkoutBooks) {
        this.availableBooks = availableBooks;
        this.checkoutBooks = checkoutBooks;

    }

    public boolean checkout(String title) {
        for (Book book : availableBooks) {
            if (book.equals(new Book(title, "", 0))) {
                availableBooks.remove(book);
                checkoutBooks.add(book);
                return true;
            }
        }
        return false;
    }

    public boolean returnBook(String title) {
        for (Book book : checkoutBooks) {
            if (book.equals(new Book(title, "", 0))) {
                checkoutBooks.remove(book);
                availableBooks.add(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        BooksPresenter booksPresenter = new BooksPresenter(new String());
        for (Book book : availableBooks) {
            book.appendBooks(booksPresenter);
        }
        return booksPresenter.toString();
    }
}
