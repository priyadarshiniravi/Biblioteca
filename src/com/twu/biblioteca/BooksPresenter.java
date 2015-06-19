package com.twu.biblioteca;

public class BooksPresenter {
    private String formattedBooks;
    private final int maximunNameLength = 30;
    private final int maximumAuthorLength = 30;

    public BooksPresenter(String formattedMovies) {
        this.formattedBooks = formattedMovies;
    }

    @Override
    public String toString() {
        return formattedBooks;
    }

    public void addBook(String name, String author, int year,User user) {
        formattedBooks += String.format("%-" + maximunNameLength + "s", name) + "|"
                + String.format("%-" + maximumAuthorLength + "s", author) + "|"
                + String.format("%-" + "4" + "s", year)+"|"+String.format("%-" + "10" + "s", user)+"\n";
    }
}
