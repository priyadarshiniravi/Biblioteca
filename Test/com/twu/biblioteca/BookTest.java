package com.twu.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class BookTest {
    @Test
    public void shouldBeBooksList() {
        Book book = new Book("Java", "Jones", 1992);

        String bookdetails = book.toString();

        assertEquals("Java,Jones,1992", bookdetails);
    }

    @Test
    public void shouldReturnLengthOfBookTitle() {
        Book book = new Book("Java", "Jones", 1992);

        int nameLength = book.nameLength();

        Assert.assertEquals(4, nameLength);

    }

    @Test
    public void shouldReturnLengthOfBookAuthor() {
        Book book = new Book("Java", "Jones", 1992);

        int nameLength = book.authorLength();

        Assert.assertEquals(5, nameLength);

    }

    @Test
    public void equalityShouldSatisfyReflexivity() {
        Book book = new Book("C++", "author", 1995);

        assertThat(book, is(equalTo(book)));
    }

    @Test
    public void equalityShouldSatisfySymmetricity() {
        Book bookOne = new Book("C++", "author", 1995);
        Book bookTwo = new Book("C++", "author", 1995);

        assertThat(bookOne, is(equalTo(bookTwo)));
        assertThat(bookTwo, is(equalTo(bookOne)));
    }

    @Test
    public void equalityShouldSatisfyTransitivity() {
        Book bookOne = new Book("C++", "author", 1995);
        Book bookTwo = new Book("C++", "author", 1995);
        Book bookThree = new Book("C++", "author", 1995);

        assertThat(bookOne, is(equalTo(bookTwo)));
        assertThat(bookTwo, is(equalTo(bookThree)));
        assertThat(bookOne, is(equalTo(bookThree)));
    }

    @Test
    public void equalityShouldReturnFalseOnPassingNull() {
        Book bookOne = new Book("C++", "author", 1995);

        assertFalse(bookOne.equals(null));
    }

    @Test
    public void equalityShouldReturnFalseOnPassingOtherObject() {
        Book bookOne = new Book("C++", "author", 1995);

        assertFalse(bookOne.equals(new String("Hello, World")));
    }

    @Test
    public void whenTwoObjectsAreEqualThenTheirHashCodeMustBeEqual() {
        Book bookOne = new Book("C++", "author", 1995);
        Book bookTwo = new Book("C++", "author", 1995);

        assertThat(bookOne.hashCode(), is(equalTo(bookTwo.hashCode())));
    }

    @Test
    public void shouldAppendBookToFormattedBooks() {
        BooksPresenter booksPresenter = mock(BooksPresenter.class);
        Book book = new Book("Minions", "xyz", 2010);

        book.appendBooks(booksPresenter);

        verify(booksPresenter).addBook("Minions", "xyz", 2010);

    }

    @Test
    public void shouldMatchTitle() {
        Book book = new Book("C", "XYZ", 1992);

        boolean actualCompare = book.isTitleMatch("C");

        assertEquals(true, actualCompare);
    }


}