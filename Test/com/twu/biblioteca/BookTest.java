package com.twu.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class BookTest {


    @Test
    public void equalityShouldSatisfyReflexivity() {
        AvailableBook book = new AvailableBook("C++", "author", 1995);

        assertThat(book, is(equalTo(book)));
    }

    @Test
    public void equalityShouldSatisfySymmetricity() {
        AvailableBook bookOne = new AvailableBook("C++", "author", 1995);
        AvailableBook bookTwo = new AvailableBook("C++", "author", 1995);

        assertThat(bookOne, is(equalTo(bookTwo)));
        assertThat(bookTwo, is(equalTo(bookOne)));
    }


    @Test
    public void equalityShouldSatisfyTransitivity() {
        AvailableBook bookOne = new AvailableBook("C++", "author", 1995);
        AvailableBook bookTwo = new AvailableBook("C++", "author", 1995);
        AvailableBook bookThree = new AvailableBook("C++", "author", 1995);

        assertThat(bookOne, is(equalTo(bookTwo)));
        assertThat(bookTwo, is(equalTo(bookThree)));
        assertThat(bookOne, is(equalTo(bookThree)));
    }

    @Test
    public void equalityShouldReturnFalseOnPassingNull() {
        AvailableBook bookOne = new AvailableBook("C++", "author", 1995);

        assertFalse(bookOne.equals(null));
    }

    @Test
    public void whenTwoObjectsAreEqualThenTheirHashCodeMustBeEqual() {
        AvailableBook bookOne = new AvailableBook("C++", "author", 1995);
        AvailableBook bookTwo = new AvailableBook("C++", "author", 1995);

        assertThat(bookOne.hashCode(), is(equalTo(bookTwo.hashCode())));
    }

    @Test
    public void shouldAppendAvailableBookToFormattedAvailableBooks() {
        BooksPresenter booksPresenter = mock(BooksPresenter.class);
        AvailableBook book = new AvailableBook("Minions", "xyz", 2010);

        book.appendBooks(booksPresenter);

        verify(booksPresenter).addBook("Minions", "xyz", 2010);
    }




}