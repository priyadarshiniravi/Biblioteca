package com.twu.biblioteca;

import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class BookTest {
    @Test
    public void shouldBeBooksList() {
        Book book = new Book("Java","Jones",1992);

        String bookdetails=book.toString();

        assertEquals("Java,Jones,1992", bookdetails);
    }

}