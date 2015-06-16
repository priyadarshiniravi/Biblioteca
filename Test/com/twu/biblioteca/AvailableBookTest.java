package com.twu.biblioteca;

import org.junit.Test;

import static com.twu.biblioteca.Messages.SUCCESS_CHECKOUT;
import static com.twu.biblioteca.Messages.SUCCESS_RETURN;
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
        NullBook expectedBook = new NullBook(null, null, 0);

        assertEquals(expectedBook, actualBookCheckedOut);

    }

    @Test
    public void shouldBeSuccessCheckoutInCheckoutBook() {
        AvailableBook book = new AvailableBook("C", "XYZ", 1998);

        String actualMessage = book.returnMessage();

        assertEquals(SUCCESS_RETURN, actualMessage);
    }

}