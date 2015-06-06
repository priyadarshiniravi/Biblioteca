package com.twu.biblioteca;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BooksTest {
    @Test
    public void shouldBeBooksDetailList() {
        ArrayList<Book> bookDetailsList=new ArrayList<Book>();
        Book firstBookStub=mock(Book.class);
        Book secondBookStub=mock(Book.class);
        when(firstBookStub.toString())
                .thenReturn("Java,Jones,1992");
        when(secondBookStub.toString())
                .thenReturn("OOPs,Patric,1992");
        bookDetailsList.add(firstBookStub);
        bookDetailsList.add(secondBookStub);

        Books books = new Books(bookDetailsList);

        String bookList=books.toString();

        assertEquals("Java,Jones,1992\nOOPs,Patric,1992\n", bookList);
    }

}