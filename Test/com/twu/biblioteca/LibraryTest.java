package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.mock;

public class LibraryTest {
    @Test
    public void shouldBeBooksDetailList() {

        AvailableBook firstBook = new AvailableBook("Java", "Jones", 1992);
        AvailableBook secondBook = new AvailableBook("OOPs", "Patric", 1992);

        HashSet<Book> books = new HashSet<>();
        books.add(firstBook);
        books.add(secondBook);


        Library library = new Library(books);

        String bookList = library.toString();

        assertEquals("OOPs                          |Patric                        |1992\n" +
                "Java                          |Jones                         |1992\n", bookList);
    }


    @Test
    public void shouldBeBooksDetailListWhichAreNotCheckedOut() {

        AvailableBook firstBook = new AvailableBook("Java", "Jones", 1992);
        CheckedOutBook secondBook = new CheckedOutBook("C", "Jones", 1995);

        HashSet<Book> books = new HashSet<>();
        books.add(firstBook);
        books.add(secondBook);


        Library library = new Library(books);

        String bookList = library.toString();

        assertEquals("Java                          |Jones                         |1992\n", bookList);
    }

    @Test
    public void shouldCheckoutIfBookIsNotCheckoutAndAvailable() {
        AvailableBook book = new AvailableBook("C", "Jones", 1995);
        AvailableBook firstBookStub = mock(AvailableBook.class);
        CheckedOutBook secondBookStub = mock(CheckedOutBook.class);
        HashSet<Book> books = new HashSet<>();
        books.add(firstBookStub);
        books.add(secondBookStub);
        books.add(book);


        Library library = new Library(books);

        Book success = library.checkout("C");

        assertEquals(Messages.SUCCESS_CHECKOUT, success.checkoutMessage());
    }

    @Test
    public void shouldNotCheckoutIfBookIsCheckoutAndAvailable() {
        CheckedOutBook book = new CheckedOutBook("C", "Jones", 1995);
        AvailableBook firstBookStub = mock(AvailableBook.class);
        CheckedOutBook secondBookStub = mock(CheckedOutBook.class);
        HashSet<Book> books = new HashSet<>();

        books.add(firstBookStub);
        books.add(secondBookStub);
        books.add(book);


        Library library = new Library(books);

        Book success = library.checkout("any");

        assertEquals(Messages.UNSUCCESS_CHECKOUT, success.checkoutMessage());
    }

    @Test
    public void shouldReturnIfBookIsCheckout() {
        CheckedOutBook book = new CheckedOutBook("C", "Jones", 1995);
        HashSet<Book> books=new HashSet<>();
        books.add(book);
        Library library = new Library(books);
        Book success = library.returnBook("C");

        assertEquals(Messages.SUCCESS_RETURN, success.returnMessage());
    }

    @Test
    public void shouldNotReturnIfBookIsNotCheckoutOrNotAvailable() {
        AvailableBook book = new AvailableBook("C", "Jones", 1995);
        AvailableBook firstBookStub = mock(AvailableBook.class);
        CheckedOutBook secondBookStub = mock(CheckedOutBook.class);
        HashSet<Book> books=new HashSet<>();
        books.add(firstBookStub);
        books.add(secondBookStub);
        books.add(book);
        Library library = new Library(books);

        Book success = library.returnBook("any");

        assertEquals(Messages.UNSUCCESSFUL_RETURN, success.returnMessage());
    }


}