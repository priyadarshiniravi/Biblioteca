package com.twu.biblioteca;

import org.junit.Test;

import java.util.LinkedHashMap;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LibraryTest {
    @Test
    public void shouldBeBooksDetailList() {

        Book firstBookStub = new Book("Java", "Jones", 1992);
        Book secondBookStub = new Book("OOPs", "Patric", 1992);
        LinkedHashMap<Book, Boolean> bookDetailsList = new LinkedHashMap<>();
        bookDetailsList.put(firstBookStub, true);
        bookDetailsList.put(secondBookStub, true);
        BookParser parser = new BookParser();
        Library library = new Library(bookDetailsList, parser);

        String bookList = library.toString();

        assertEquals("Java                          |Jones                         |1992\nOOPs                          |Patric                        |1992\n", bookList);
    }


    @Test
    public void shouldBeBooksDetailListWhichAreNotCheckedOut() {

        Book firstBook = new Book("Java", "Jones", 1992);
        Book secondBook = new Book("C", "Jones", 1995);

        LinkedHashMap<Book, Boolean> bookDetailsList = new LinkedHashMap<>();
        bookDetailsList.put(firstBook, true);
        bookDetailsList.put(secondBook, false);
        BookParser parser = new BookParser();
        Library library = new Library(bookDetailsList, parser);

        String bookList = library.toString();

        assertEquals("Java                          |Jones                         |1992\n", bookList);
    }

    @Test
    public void shouldCheckoutIfBookIsNotCheckoutAndAvailable() {
        Book book = new Book("C", "Jones", 1995);
        Book firstBookStub = mock(Book.class);
        Book secondBookStub = mock(Book.class);
        LinkedHashMap<Book, Boolean> bookDetailsList = new LinkedHashMap<>();
        bookDetailsList.put(firstBookStub, true);
        bookDetailsList.put(secondBookStub, false);
        bookDetailsList.put(book, true);
        BookParser parser = mock(BookParser.class);
        when(parser.parse("any"))
                .thenReturn(book);
        Library library = new Library(bookDetailsList, parser);

        boolean success = library.checkout("any");

        assertEquals(true, success);
    }

    @Test
    public void shouldNotCheckoutIfBookIsCheckoutAndAvailable() {
        Book book = new Book("C", "Jones", 1995);
        Book firstBookStub = mock(Book.class);
        Book secondBookStub = mock(Book.class);
        LinkedHashMap<Book, Boolean> bookDetailsList = new LinkedHashMap<>();
        bookDetailsList.put(firstBookStub, true);
        bookDetailsList.put(secondBookStub, false);
        bookDetailsList.put(book, false);
        BookParser parser = mock(BookParser.class);
        when(parser.parse("any"))
                .thenReturn(book);
        Library library = new Library(bookDetailsList, parser);

        boolean success = library.checkout("any");

        assertEquals(false, success);
    }

    @Test
    public void shouldReturnIfBookIsCheckout() {
        Book book = new Book("C", "Jones", 1995);
        Book firstBookStub = mock(Book.class);
        Book secondBookStub = mock(Book.class);
        LinkedHashMap<Book, Boolean> bookDetailsList = new LinkedHashMap<>();
        bookDetailsList.put(firstBookStub, true);
        bookDetailsList.put(secondBookStub, false);
        bookDetailsList.put(book, false);
        BookParser parser = mock(BookParser.class);
        when(parser.parse("any"))
                .thenReturn(book);
        Library library = new Library(bookDetailsList, parser);

        boolean success = library.returnBook("any");

        assertEquals(true, success);
    }

    @Test
    public void shouldNotReturnIfBookIsNotCheckoutOrNotAvailable() {
        Book book = new Book("C", "Jones", 1995);
        Book firstBookStub = mock(Book.class);
        Book secondBookStub = mock(Book.class);
        LinkedHashMap<Book, Boolean> bookDetailsList = new LinkedHashMap<>();
        bookDetailsList.put(firstBookStub, true);
        bookDetailsList.put(secondBookStub, false);
        bookDetailsList.put(book, true);
        BookParser parser = mock(BookParser.class);
        when(parser.parse("any"))
                .thenReturn(book);
        Library library = new Library(bookDetailsList, parser);

        boolean success = library.returnBook("any");

        assertEquals(false, success);
    }


}