package com.twu.biblioteca;


import java.util.LinkedHashMap;

public class Books {
    private LinkedHashMap<Book, Boolean> bookBooleanHashMap = new LinkedHashMap<>();
    private BookParser parser;


    public Books(LinkedHashMap<Book, Boolean> bookBooleanHashMap, BookParser parser) {
        this.bookBooleanHashMap = bookBooleanHashMap;
        this.parser = parser;
    }

    public boolean checkout(String title)
    {
        for (Book book : bookBooleanHashMap.keySet()) {
            if (bookBooleanHashMap.get(book) && book.equals(parser.parse(title))) {
                bookBooleanHashMap.put(book,false);
                return true;
            }
        }
        return false;
    }

    public boolean returnBook(String title)
    {
        for (Book book : bookBooleanHashMap.keySet()) {
            if (!bookBooleanHashMap.get(book) && book.equals(parser.parse(title))) {
                bookBooleanHashMap.put(book,true);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String bookList = new String();
        for (Book book : bookBooleanHashMap.keySet()) {
            if (bookBooleanHashMap.get(book))
            bookList += book.toString() + "\n";
        }
        return bookList;
    }
}
