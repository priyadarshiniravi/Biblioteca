package com.twu.biblioteca;

import org.junit.Test;

import java.util.HashMap;

import static junit.framework.TestCase.assertEquals;
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
        HashMap<Book,Boolean> bookDetailsList= new HashMap<>();
        bookDetailsList.put(firstBookStub,true);
        bookDetailsList.put(secondBookStub,true);
        BookParser parser=new BookParser();
        Books books = new Books(bookDetailsList, parser);

        String bookList = books.toString();

        assertEquals("OOPs,Patric,1992\nJava,Jones,1992\n", bookList);
    }


    @Test
    public void shouldBeBooksDetailListWhichAreNotCheckedOut() {

        Book firstBookStub = mock(Book.class);
        Book secondBookStub = mock(Book.class);
        when(firstBookStub.toString())
                .thenReturn("Java,Jones,1992");
        when(secondBookStub.toString())
                .thenReturn("OOPs,Patric,1992");
        HashMap<Book,Boolean> bookDetailsList= new HashMap<>();
        bookDetailsList.put(firstBookStub,true);
        bookDetailsList.put(secondBookStub,false);
        BookParser parser=new BookParser();
        Books books = new Books(bookDetailsList, parser);

        String bookList = books.toString();

        assertEquals("Java,Jones,1992\n", bookList);
    }


}