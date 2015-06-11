package com.twu.biblioteca;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class ParserTest {

    @Test
    public void inputShouldBeParsed() {
        HashMap<Integer, Options> menuOptions = new HashMap<>();
        Scanner consoleInput = new Scanner(System.in);
        ConsoleInputOutput consoleInputOutput = new ConsoleInputOutput(consoleInput);
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("C++", "Jones", 1992));
        Books books = new Books(bookList);
        ListBooks listBooks=new ListBooks(consoleInputOutput, books);
        menuOptions.put(1, listBooks);
        Parser parser=new Parser(menuOptions);

        Options Actualoptions=parser.parse(1);

        assertEquals(listBooks,Actualoptions);



    }


}