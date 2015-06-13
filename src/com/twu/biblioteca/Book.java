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
}
