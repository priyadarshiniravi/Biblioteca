package com.twu.biblioteca;

import static com.twu.biblioteca.Messages.UNSUCCESSFUL_RETURN;
import static com.twu.biblioteca.Messages.UNSUCCESS_CHECKOUT;

public class NullBook extends Book {

    public NullBook(String name, String author, int yearOfPublication) {
        super(name, author, yearOfPublication);
    }

    @Override
    public Book checkoutBook() {
        return createNullBook();
    }

    @Override
    public Book returnBook() {
        return createNullBook();
    }

    public static NullBook createNullBook() {

        return new NullBook(null, null, 0);
    }

    public String returnMessage() {
        return UNSUCCESSFUL_RETURN;
    }

    public String checkoutMessage() {
        return UNSUCCESS_CHECKOUT;
    }
}
