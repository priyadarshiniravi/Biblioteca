package com.twu.biblioteca;


public abstract class Book {
    protected String name;
    protected String author;
    protected int yearOfPublication;

    public Book(String name, String author, int yearOfPublication) {
        this.name = name;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;

        Book book = (Book) o;

        return !(name != null ? !name.equals(book.name) : book.name != null);

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }


    public void appendBooks(BooksPresenter booksPresenter) {
        booksPresenter.addBook(name, author, yearOfPublication);
    }

    public boolean isTitleMatch(String name) {
        if (this.name == null){
        return false;}
        return this.name.equals(name);
    }

    public abstract Book checkoutBook(User user);

    public abstract Book returnBook(User user);

    public abstract String returnMessage();

    public abstract String checkoutMessage();


}
