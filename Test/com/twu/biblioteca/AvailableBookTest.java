package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AvailableBookTest {
    @Test
    public void shouldBeSuccessForCheckingOutAvailableBook() {
        AvailableBook book = new AvailableBook("C", "XYZ", 1998);

        CheckedOutBook actualBookCheckedOut = book.checkout();
        CheckedOutBook expectedBook = new CheckedOutBook("C", "XYZ", 1998);

        assertEquals(expectedBook, actualBookCheckedOut);

    }


}