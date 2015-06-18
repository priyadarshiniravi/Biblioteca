package com.twu.biblioteca;

import org.junit.Test;

import static com.twu.biblioteca.Messages.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class CheckedOutBookTest {
    @Test
    public void shouldBeSuccessForReturningCheckedOutBook() {
        User user=mock(User.class);
        CheckedOutBook book = new CheckedOutBook("C", "XYZ", 1998, user);

        Book actualBookAvailable = book.returnBook(user);
        AvailableBook expectedBook = new AvailableBook("C", "XYZ", 1998);

        assertEquals(expectedBook, actualBookAvailable);

    }

    @Test
    public void shouldBeNullBookForCheckingOutCheckedOutBook() {
        User user=mock(User.class);
        CheckedOutBook book = new CheckedOutBook("C", "XYZ", 1998, user);

        NullBook actualBookAvailable = book.checkoutBook(user);
        NullBook expectedBook = new NullBook(null, null, 0);

        assertEquals(expectedBook, actualBookAvailable);

    }

    @Test
    public void shouldBeSuccessCheckoutInCheckoutBook() {
        User user=mock(User.class);
        CheckedOutBook book = new CheckedOutBook("C", "XYZ", 1998, user);

        String actualMessage = book.checkoutMessage();

        assertEquals(SUCCESS_CHECKOUT_BOOK,actualMessage);
    }
}