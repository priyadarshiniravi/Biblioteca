package com.twu.biblioteca;

//Print Ouput Message onto the Screen
public class OutputMessages {

    public void displayWelcomeMessage()
    {
        System.out.println("Welcome To Biblioteca!!!");
    }

    public void displayBookList(Books books)
    {
        System.out.println(books.toString());
    }
}
