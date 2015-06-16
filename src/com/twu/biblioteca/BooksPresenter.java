package com.twu.biblioteca;

public class BooksPresenter {
    private String formattedBooks;

    public BooksPresenter(String formattedMovies) {
        this.formattedBooks = formattedMovies;
    }

    @Override
    public String toString() {
        return formattedBooks;
    }
}
