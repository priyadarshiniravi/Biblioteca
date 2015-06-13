package com.twu.biblioteca;


import java.util.HashMap;

public class Books {
    private HashMap<Book, Boolean> bookBooleanHashMap = new HashMap<>();


    public Books(HashMap<Book, Boolean> bookBooleanHashMap) {
        this.bookBooleanHashMap = bookBooleanHashMap;
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
