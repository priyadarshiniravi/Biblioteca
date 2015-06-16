package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.internal.matchers.Null;

import static org.junit.Assert.assertEquals;

public class AvailableBookTest {
    @Test
    public void shouldBeSuccessForCheckingOutAvailableBook() {
        AvailableBook book = new AvailableBook("C", "XYZ", 1998);

        CheckedOutBook actualBookCheckedOut = book.checkoutBook();
        CheckedOutBook expectedBook = new CheckedOutBook("C", "XYZ", 1998);

        assertEquals(expectedBook, actualBookCheckedOut);

    }

    @Test
    public void shouldBeNullBookForReturnAvailableBook() {
        AvailableBook book = new AvailableBook("C", "XYZ", 1998);

        NullBook actualBookCheckedOut = book.ReturnBook();
        NullBook expectedBook = new NullBook("C", "XYZ", 1998);

        assertEquals(expectedBook, actualBookCheckedOut);

    }


}