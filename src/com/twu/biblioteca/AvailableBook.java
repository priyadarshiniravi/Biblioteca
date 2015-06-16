package com.twu.biblioteca;

import static com.twu.biblioteca.Messages.SUCCESS_CHECKOUT;

public class AvailableBook extends Book {

    public AvailableBook(String name, String author, int yearOfPublication) {
        super(name, author, yearOfPublication);
    }

    public CheckedOutBook checkout()
    {
        return CheckedOutBook.createCheckoutBook(this);
    }

}
