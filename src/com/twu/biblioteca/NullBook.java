package com.twu.biblioteca;

import static com.twu.biblioteca.Messages.UNSUCCESSFUL_RETURN_BOOK;
import static com.twu.biblioteca.Messages.UNSUCCESS_CHECKOUT_BOOK;

public class NullBook extends Book {

    public NullBook(String name, String author, int yearOfPublication) {
        super(name, author, yearOfPublication);
    }

    @Override
    public Book checkoutBook(User user) {
        return createNullBook();
    }

    @Override
    public Book returnBook(User user) {
        return createNullBook();
    }

    public static NullBook createNullBook() {

        return new NullBook(null, null, 0);
    }

    public String returnMessage() {
        return UNSUCCESSFUL_RETURN_BOOK;
    }

    public String checkoutMessage() {
        return UNSUCCESS_CHECKOUT_BOOK;
    }
}

