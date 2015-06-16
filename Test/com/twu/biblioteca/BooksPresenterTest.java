package com.twu.biblioteca;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BooksPresenterTest {
    @Test
    public void shouldReturnToString() {
        String FormattedBooks = "MyString";
        BooksPresenter bookPresenter = new BooksPresenter(FormattedBooks);

        String actualString = bookPresenter.toString();

        assertEquals("MyString", actualString);
    }

    @Test
    public void shouldAddBookToTheFormattedMovieList() {
        String FormattedMovies = new String();
        BooksPresenter booksPresenter = new BooksPresenter(FormattedMovies);

        booksPresenter.addBook("C++", "ABC", 1998);
        booksPresenter.addBook("UP", "xyz", 1987);
        String actualFormattedMovies = booksPresenter.toString();

        assertEquals("UP                            |xyz                           |1987", actualFormattedMovies);
    }

}