package com.twu.biblioteca;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BooksTest {
    @Test
    public void shouldBeBooksDetailList() {

        Book firstBookStub = mock(Book.class);
        Book secondBookStub = mock(Book.class);
        when(firstBookStub.toString())
                .thenReturn("Java,Jones,1992");
        when(secondBookStub.toString())
                .thenReturn("OOPs,Patric,1992");
        LinkedHashMap<Book, Boolean> bookDetailsList = new LinkedHashMap<>();
        bookDetailsList.put(firstBookStub, true);
        bookDetailsList.put(secondBookStub, true);
        BookParser parser = new BookParser();
        Books books = new Books(bookDetailsList, parser);

        String bookList = books.toString();

        assertEquals("Java,Jones,1992\nOOPs,Patric,1992\n", bookList);
    }


    @Test
    public void shouldBeBooksDetailListWhichAreNotCheckedOut() {

        Book firstBookStub = mock(Book.class);
        Book secondBookStub = mock(Book.class);
        when(firstBookStub.toString())
                .thenReturn("Java,Jones,1992");
        when(secondBookStub.toString())
                .thenReturn("OOPs,Patric,1992");
        LinkedHashMap<Book, Boolean> bookDetailsList = new LinkedHashMap<>();
        bookDetailsList.put(firstBookStub, true);
        bookDetailsList.put(secondBookStub, false);
        BookParser parser = new BookParser();
        Books books = new Books(bookDetailsList, parser);

        String bookList = books.toString();

        assertEquals("Java,Jones,1992\n", bookList);
    }

    @Test
    public void shouldCheckoutIfBookIsNotCheckoutAndAvailable() {
        Book book=new Book("C","Jones",1995);
        Book firstBookStub = mock(Book.class);
        Book secondBookStub = mock(Book.class);
        LinkedHashMap<Book, Boolean> bookDetailsList = new LinkedHashMap<>();
        bookDetailsList.put(firstBookStub, true);
        bookDetailsList.put(secondBookStub, false);
        bookDetailsList.put(book,true);
        BookParser parser = mock(BookParser.class);
        when(parser.parse("any"))
                .thenReturn(book);
        Books books = new Books(bookDetailsList, parser);

        boolean success = books.checkout("any");

        assertEquals(true, success);
    }

    @Test
    public void shouldNotCheckoutIfBookIsCheckoutAndAvailable() {
        Book book=new Book("C","Jones",1995);
        Book firstBookStub = mock(Book.class);
        Book secondBookStub = mock(Book.class);
        LinkedHashMap<Book, Boolean> bookDetailsList = new LinkedHashMap<>();
        bookDetailsList.put(firstBookStub, true);
        bookDetailsList.put(secondBookStub, false);
        bookDetailsList.put(book,false);
        BookParser parser = mock(BookParser.class);
        when(parser.parse("any"))
                .thenReturn(book);
        Books books = new Books(bookDetailsList, parser);

        boolean success = books.checkout("any");

        assertEquals(false, success);
    }

    @Test
    public void shouldReturnIfBookIsCheckout() {
        Book book=new Book("C","Jones",1995);
        Book firstBookStub = mock(Book.class);
        Book secondBookStub = mock(Book.class);
        LinkedHashMap<Book, Boolean> bookDetailsList = new LinkedHashMap<>();
        bookDetailsList.put(firstBookStub, true);
        bookDetailsList.put(secondBookStub, false);
        bookDetailsList.put(book,false);
        BookParser parser = mock(BookParser.class);
        when(parser.parse("any"))
                .thenReturn(book);
        Books books = new Books(bookDetailsList, parser);

        boolean success = books.returnBook("any");

        assertEquals(true, success);
    }

    @Test
    public void shouldNotReturnIfBookIsNotCheckoutOrNotAvailable() {
        Book book=new Book("C","Jones",1995);
        Book firstBookStub = mock(Book.class);
        Book secondBookStub = mock(Book.class);
        LinkedHashMap<Book, Boolean> bookDetailsList = new LinkedHashMap<>();
        bookDetailsList.put(firstBookStub, true);
        bookDetailsList.put(secondBookStub, false);
        bookDetailsList.put(book,true);
        BookParser parser = mock(BookParser.class);
        when(parser.parse("any"))
                .thenReturn(book);
        Books books = new Books(bookDetailsList, parser);

        boolean success = books.returnBook("any");

        assertEquals(false, success);
    }

}