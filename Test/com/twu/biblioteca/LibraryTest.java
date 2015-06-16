package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LibraryTest {
    @Test
    public void shouldBeBooksDetailList() {

        Book firstBook = new Book("Java", "Jones", 1992);
        Book secondBook = new Book("OOPs", "Patric", 1992);

        ArrayList<Book> availableBooks = new ArrayList<>();
        ArrayList<Book> checkoutBooks = new ArrayList<>();
        availableBooks.add(firstBook);
        availableBooks.add(secondBook);


        Library library = new Library(availableBooks, checkoutBooks);

        String bookList = library.toString();

        assertEquals("Java                          |Jones                         |1992\nOOPs                          |Patric                        |1992\n", bookList);
    }


    @Test
    public void shouldBeBooksDetailListWhichAreNotCheckedOut() {

        Book firstBook = new Book("Java", "Jones", 1992);
        Book secondBook = new Book("C", "Jones", 1995);

        ArrayList<Book> availableBooks = new ArrayList<>();
        ArrayList<Book> checkoutBooks = new ArrayList<>();
        availableBooks.add(firstBook);
        checkoutBooks.add(secondBook);


        Library library = new Library(availableBooks, checkoutBooks);

        String bookList = library.toString();

        assertEquals("Java                          |Jones                         |1992\n", bookList);
    }

    @Test
    public void shouldCheckoutIfBookIsNotCheckoutAndAvailable() {
        Book book = new Book("C", "Jones", 1995);
        Book firstBookStub = mock(Book.class);
        Book secondBookStub = mock(Book.class);
        ArrayList<Book> availableBooks = new ArrayList<>();
        ArrayList<Book> checkoutBooks = new ArrayList<>();
        availableBooks.add(firstBookStub);
        checkoutBooks.add(secondBookStub);
        availableBooks.add(book);


        Library library = new Library(availableBooks, checkoutBooks);

        boolean success = library.checkout("C");

        assertEquals(true, success);
    }

    @Test
    public void shouldNotCheckoutIfBookIsCheckoutAndAvailable() {
        Book book = new Book("C", "Jones", 1995);
        Book firstBookStub = mock(Book.class);
        Book secondBookStub = mock(Book.class);
        ArrayList<Book> availableBooks = new ArrayList<>();
        ArrayList<Book> checkoutBooks = new ArrayList<>();
        availableBooks.add(firstBookStub);
        checkoutBooks.add(secondBookStub);
        checkoutBooks.add(book);


        Library library = new Library(availableBooks, checkoutBooks);

        boolean success = library.checkout("any");

        assertEquals(false, success);
    }

    @Test
    public void shouldReturnIfBookIsCheckout() {
        Book book = new Book("C", "Jones", 1995);
        Book firstBookStub = mock(Book.class);
        Book secondBookStub = mock(Book.class);
        ArrayList<Book> availableBooks = new ArrayList<>();
        ArrayList<Book> checkoutBooks = new ArrayList<>();
        availableBooks.add(firstBookStub);
        checkoutBooks.add(secondBookStub);
        checkoutBooks.add(book);
        Library library = new Library(availableBooks, checkoutBooks);
        boolean success = library.returnBook("C");

        assertEquals(true, success);
    }

    @Test
    public void shouldNotReturnIfBookIsNotCheckoutOrNotAvailable() {
        Book book = new Book("C", "Jones", 1995);
        Book firstBookStub = mock(Book.class);
        Book secondBookStub = mock(Book.class);
        ArrayList<Book> availableBooks = new ArrayList<>();
        ArrayList<Book> checkoutBooks = new ArrayList<>();
        availableBooks.add(firstBookStub);
        checkoutBooks.add(secondBookStub);
        availableBooks.add(book);
        Library library = new Library(availableBooks, checkoutBooks);

        boolean success = library.returnBook("any");

        assertEquals(false, success);
    }


}