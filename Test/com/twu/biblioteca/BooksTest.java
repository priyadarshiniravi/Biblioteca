package com.twu.biblioteca;

import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BooksTest {
    @Test
    public void shouldBeBooksList() {
        Books books = new Books();

        String bookList=books.toString();

        assertEquals("Java\nOOP\nC++\n", bookList);
    }

}