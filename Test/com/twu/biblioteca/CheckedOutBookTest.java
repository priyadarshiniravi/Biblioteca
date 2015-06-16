package com.twu.biblioteca;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckedOutBookTest {
    @Test
    public void shouldBeSuccessForReturningCheckedOutBook() {
        CheckedOutBook book = new CheckedOutBook("C", "XYZ", 1998);

        AvailableBook actualBookAvailable = book.checkout();
        AvailableBook expectedBook = new AvailableBook("C", "XYZ", 1998);

        assertEquals(expectedBook, actualBookAvailable);

    }

}