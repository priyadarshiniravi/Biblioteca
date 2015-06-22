package com.twu.biblioteca;


import static com.twu.biblioteca.Messages.SUCCESS_CHECKOUT_BOOK;

public class CheckedOutBook extends Book {
    private User user;

    public CheckedOutBook(String name, String author, int yearOfPublication, User user) {
        super(name, author, yearOfPublication);
        this.user = user;
    }


    public static CheckedOutBook createCheckoutBook(AvailableBook availableBook, User user) {

        return new CheckedOutBook(availableBook.name, availableBook.author, availableBook.yearOfPublication, user);

    }

    @Override
    public Book returnBook(User user) {
        if(user==this.user) {
            return AvailableBook.createAvailableBook(this);
        }
        else
            return NullBook.createNullBook();
    }

    @Override
    public String returnMessage() {
        return null;
    }

    @Override
    public void appendAvailableBooks(BooksPresenter booksPresenter) {

    }

    @Override
    public void appendCheckedOutBooks(BooksPresenter booksPresenter) {
        booksPresenter.addBook(name, author, yearOfPublication,user);
    }

    @Override
    public NullBook checkoutBook(User user) {
        return NullBook.createNullBook();
    }

    @Override
    public String checkoutMessage() {
        return SUCCESS_CHECKOUT_BOOK;
    }

}
