package com.twu.biblioteca;


import java.util.HashSet;

public class Library {
    private HashSet<Book> books;
    private HashSet<Movie> movies;
    private BooksPresenter booksPresenter;
    private MoviesPresenter moviesPresenter;

    public Library(HashSet<Book> books, HashSet<Movie> movies, BooksPresenter booksPresenter, MoviesPresenter moviesPresenter) {
        this.books = books;
        this.movies = movies;
        this.booksPresenter = booksPresenter;
        this.moviesPresenter = moviesPresenter;
    }

    public synchronized Book checkoutBook(String title) {
        Book book = BookSearch(title);
        books.remove(book);
        books.add(book.checkoutBook());
        return book.checkoutBook();
    }

    public synchronized Book returnBook(String title) {
        Book book = BookSearch(title);
        books.remove(book);
        books.add(book.returnBook());
        return book.returnBook();
    }

    public String formattedBookString() {
        for (Book book : books) {
            if (book instanceof AvailableBook) {
                book.appendBooks(booksPresenter);
            }
        }
        return booksPresenter.toString();
    }



    private Book BookSearch(String title) {
        for (Book book : books) {
            if (book.isTitleMatch(title))
                return book;
        }
        return new NullBook(null, null, 0);
    }


}
