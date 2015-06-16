package com.twu.biblioteca;


public class CheckedOutBook extends Book {

    public CheckedOutBook(String name, String author, int yearOfPublication) {
        super(name, author, yearOfPublication);
    }


    public static CheckedOutBook createCheckoutBook(AvailableBook availableBook) {

        return new CheckedOutBook(availableBook.name,availableBook.author,availableBook.yearOfPublication);
    }

    public AvailableBook returnBook() {
        return AvailableBook.createAvailableBook(this);
    }
}
