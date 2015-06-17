package com.twu.biblioteca;

import org.junit.Test;

import static com.twu.biblioteca.Messages.SUCCESS_RETURN_BOOK;
import static org.junit.Assert.assertEquals;

public class AvailableBookTest {
    @Test
    public void shouldBeSuccessForCheckingOutAvailableBook() {
        AvailableBook book = new AvailableBook("C", "XYZ", 1998);

        Book actualBookCheckedOut = book.checkoutBook();
        CheckedOutBook expectedBook = new CheckedOutBook("C", "XYZ", 1998);

        assertEquals(expectedBook, actualBookCheckedOut);

    }

    @Test
    public void shouldBeNullBookForReturnAvailableBook() {
        AvailableBook book = new AvailableBook("C", "XYZ", 1998);

        Book actualBookCheckedOut = book.returnBook();
        NullBook expectedBook = new NullBook(null, null, 0);

        assertEquals(expectedBook, actualBookCheckedOut);

    }

    @Test
    public void shouldBeSuccessReturnInAvailableBook() {
        AvailableBook book = new AvailableBook("C", "XYZ", 1998);

        String actualMessage = book.returnMessage();

        assertEquals(SUCCESS_RETURN_BOOK, actualMessage);
    }

}