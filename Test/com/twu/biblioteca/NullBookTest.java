package com.twu.biblioteca;

import org.junit.Test;

import static com.twu.biblioteca.Messages.UNSUCCESSFUL_RETURN_BOOK;
import static com.twu.biblioteca.Messages.UNSUCCESS_CHECKOUT_BOOK;
import static org.junit.Assert.assertEquals;

public class NullBookTest {
    @Test
    public void shouldBeUnSuccessReturnInNullBook() {
        NullBook book = new NullBook("C", "XYZ", 1998);

        String actualMessage = book.returnMessage();

        assertEquals(UNSUCCESSFUL_RETURN_BOOK, actualMessage);
    }

    @Test
    public void shouldBeUnSuccessCheckoutInNullBook() {
        NullBook book = new NullBook("C", "XYZ", 1998);

        String actualMessage = book.checkoutMessage();

        assertEquals(UNSUCCESS_CHECKOUT_BOOK, actualMessage);
    }


}