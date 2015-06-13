package com.twu.biblioteca;


import java.util.HashMap;

public class Books {
    private HashMap<Book, Boolean> bookBooleanHashMap = new HashMap<>();
    private BookParser parser;


    public Books(HashMap<Book, Boolean> bookBooleanHashMap, BookParser parser) {
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
