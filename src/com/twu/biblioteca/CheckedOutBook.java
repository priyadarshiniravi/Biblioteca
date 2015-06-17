package com.twu.biblioteca;


import static com.twu.biblioteca.Messages.*;

public class CheckedOutBook extends Book {

    public CheckedOutBook(String name, String author, int yearOfPublication) {
        super(name, author, yearOfPublication);
    }


    public static CheckedOutBook createCheckoutBook(AvailableBook availableBook) {

        return new CheckedOutBook(availableBook.name, availableBook.author, availableBook.yearOfPublication);
    }
    @Override
    public Book returnBook() {
        return AvailableBook.createAvailableBook(this);
    }

    @Override
    public String returnMessage() {
        return null;
    }
    @Override
    public NullBook checkoutBook() {
        return NullBook.createNullBook();
    }
    @Override
    public String checkoutMessage()
    {
        return SUCCESS_CHECKOUT_BOOK;
    }

}
