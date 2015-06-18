package com.twu.biblioteca;

import static com.twu.biblioteca.Messages.SUCCESS_RETURN_BOOK;

public class AvailableBook extends Book {

    public AvailableBook(String name, String author, int yearOfPublication) {
        super(name, author, yearOfPublication);
    }

    @Override
    public Book checkoutBook(User user) {
        return CheckedOutBook.createCheckoutBook(this,user);
    }

    @Override
    public Book returnBook(User user) {
        return NullBook.createNullBook();
    }

    public static AvailableBook createAvailableBook(CheckedOutBook checkedOutBook) {
        return new AvailableBook(checkedOutBook.name, checkedOutBook.author, checkedOutBook.yearOfPublication);
    }

    @Override
    public String returnMessage() {
        return SUCCESS_RETURN_BOOK;
    }
    public void appendBooks(BooksPresenter booksPresenter) {
        booksPresenter.addBook(name, author, yearOfPublication);
    }

    @Override
    public String checkoutMessage() {
        return null;
    }


}
