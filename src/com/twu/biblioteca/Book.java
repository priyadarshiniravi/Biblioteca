package com.twu.biblioteca;


public class Book {
    private String name;
    private String author;
    private int yearOfPublication;

    public Book(String name, String author, int yearOfPublication) {
        this.name = name;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public int nameLength() {
        return name.length();
    }

    @Override
    public String toString() {
        return name + "," + author + "," + yearOfPublication;
    }

    public int authorLength() {
        return author.length();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

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
        return this.name.equals(name);
    }
}
