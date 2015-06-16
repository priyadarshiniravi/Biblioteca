package com.twu.biblioteca;

import org.junit.Test;

import static com.twu.biblioteca.Messages.*;
import static org.junit.Assert.assertEquals;

public class CheckedOutBookTest {
    @Test
    public void shouldBeSuccessForReturningCheckedOutBook() {
        CheckedOutBook book = new CheckedOutBook("C", "XYZ", 1998);

        Book actualBookAvailable = book.returnBook();
        AvailableBook expectedBook = new AvailableBook("C", "XYZ", 1998);

        assertEquals(expectedBook, actualBookAvailable);

    }

    @Test
    public void shouldBeNullBookForCheckingOutCheckedOutBook() {
        CheckedOutBook book = new CheckedOutBook("C", "XYZ", 1998);

        NullBook actualBookAvailable = book.checkoutBook();
        NullBook expectedBook = new NullBook(null, null, 0);

        assertEquals(expectedBook, actualBookAvailable);

    }

    @Test
    public void shouldBeSuccessCheckoutInCheckoutBook() {
        CheckedOutBook book = new CheckedOutBook("C", "XYZ", 1998);

        String actualMessage = book.checkoutMessage();

        assertEquals(SUCCESS_CHECKOUT,actualMessage);
    }
}