package com.twu.biblioteca;

public class AvailableBook extends Book {

    public AvailableBook(String name, String author, int yearOfPublication) {
        super(name, author, yearOfPublication);
    }

    public CheckedOutBook checkoutBook() {
        return CheckedOutBook.createCheckoutBook(this);
    }

    public NullBook ReturnBook() {
        return NullBook.createNullBook();
    }

    public static AvailableBook createAvailableBook(CheckedOutBook checkedOutBook) {
        return new AvailableBook(checkedOutBook.name, checkedOutBook.author, checkedOutBook.yearOfPublication);
    }


}
