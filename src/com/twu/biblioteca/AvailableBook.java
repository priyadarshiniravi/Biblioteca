package com.twu.biblioteca;

import static com.twu.biblioteca.Messages.SUCCESS_RETURN;

public class AvailableBook extends Book {

    public AvailableBook(String name, String author, int yearOfPublication) {
        super(name, author, yearOfPublication);
    }

    @Override
    public Book checkoutBook() {
        return CheckedOutBook.createCheckoutBook(this);
    }

    @Override
    public Book returnBook() {
        return NullBook.createNullBook();
    }

    public static AvailableBook createAvailableBook(CheckedOutBook checkedOutBook) {
        return new AvailableBook(checkedOutBook.name, checkedOutBook.author, checkedOutBook.yearOfPublication);
    }

    public String returnMessage() {
        return SUCCESS_RETURN;
    }

    @Override
    public String checkoutMessage() {
        return null;
    }


}
