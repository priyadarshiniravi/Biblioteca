package com.twu.biblioteca;


import java.util.ArrayList;

public class Books {
    private ArrayList<Book> booksDetails = new ArrayList<Book>();

    public Books(ArrayList<Book> booksDetails) {
        this.booksDetails=booksDetails;
    }


    @Override
    public String toString() {
        String bookList=new String();
        for (Book book : booksDetails)
            bookList+=book.toString()+"\n";
        return bookList;
    }
}
