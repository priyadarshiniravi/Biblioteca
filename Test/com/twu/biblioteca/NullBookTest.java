package com.twu.biblioteca;

import org.junit.Test;

import static com.twu.biblioteca.Messages.UNSUCCESSFUL_RETURN;
import static com.twu.biblioteca.Messages.UNSUCCESS_CHECKOUT;
import static org.junit.Assert.assertEquals;

public class NullBookTest {
    @Test
    public void shouldBeUnSuccessReturnInNullBook() {
        NullBook book = new NullBook("C", "XYZ", 1998);

        String actualMessage = book.returnMessage();

        assertEquals(UNSUCCESSFUL_RETURN, actualMessage);
    }

    @Test
    public void shouldBeUnSuccessCheckoutInNullBook() {
        NullBook book = new NullBook("C", "XYZ", 1998);

        String actualMessage = book.checkoutMessage();

        assertEquals(UNSUCCESS_CHECKOUT, actualMessage);
    }


}