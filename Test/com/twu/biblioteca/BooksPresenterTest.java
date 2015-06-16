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

}