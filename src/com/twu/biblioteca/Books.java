package com.twu.biblioteca;


import java.util.ArrayList;

public class Books {
    private ArrayList<String> booksDetails = new ArrayList<String>();

    public Books() {
        booksDetails.add("Java");
        booksDetails.add("OOP");
        booksDetails.add("C++");
    }


    @Override
    public String toString() {
        String booksList=new String();
        for (String book : booksDetails)
            booksList+=booksDetails;
        return booksList;

    }
}
