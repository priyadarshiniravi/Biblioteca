package com.twu.biblioteca;

import junit.framework.TestCase;
import org.junit.Test;

import static com.twu.biblioteca.Messages.*;
import static org.junit.Assert.assertEquals;

public class NullMovieTest {

    @Test
    public void shouldBeUnSuccessCheckoutInNullMovie() {
        NullMovie movie = new NullMovie("C",1998,"XYZ", 1);

        String actualMessage = movie.checkoutMessage();

        assertEquals(Messages.UNSUCCESS_CHECKOUT_MOVIE, actualMessage);
    }

    @Test
    public void shouldBeUnSuccessReturnInNullMovie() {
        NullMovie movie = new NullMovie("C",1998,"XYZ", 1);

        String actualMessage = movie.returnMessage();

        assertEquals(Messages.UNSUCCESSFUL_RETURN_MOVIE, actualMessage);
    }

}