package com.twu.biblioteca;


import java.util.LinkedHashMap;

public class Library {
    private LinkedHashMap<Book, Boolean> bookBooleanHashMap = new LinkedHashMap<>();
    private BookParser parser;


    public Library(LinkedHashMap<Book, Boolean> bookBooleanHashMap, BookParser parser) {
        this.bookBooleanHashMap = bookBooleanHashMap;
        this.parser = parser;
    }

    public boolean checkout(String title) {
        for (Book book : bookBooleanHashMap.keySet()) {
            if (bookBooleanHashMap.get(book) && book.equals(parser.parse(title))) {
                bookBooleanHashMap.put(book, false);
                return true;
            }
        }
        return false;
    }

    public boolean returnBook(String title) {
        for (Book book : bookBooleanHashMap.keySet()) {
            if (!bookBooleanHashMap.get(book) && book.equals(parser.parse(title))) {
                bookBooleanHashMap.put(book, true);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        BooksPresenter booksPresenter = new BooksPresenter(new String());
        for (Book book : bookBooleanHashMap.keySet()) {
            if (bookBooleanHashMap.get(book))
                book.appendBooks(booksPresenter);
        }
        return booksPresenter.toString();
    }
}
