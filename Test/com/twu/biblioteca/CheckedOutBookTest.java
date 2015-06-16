package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckedOutBookTest {
    @Test
    public void shouldBeSuccessForReturningCheckedOutBook() {
        CheckedOutBook book = new CheckedOutBook("C", "XYZ", 1998);

        AvailableBook actualBookAvailable = book.returnBook();
        AvailableBook expectedBook = new AvailableBook("C", "XYZ", 1998);

        assertEquals(expectedBook, actualBookAvailable);

    }

}