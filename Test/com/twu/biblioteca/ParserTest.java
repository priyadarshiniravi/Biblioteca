package com.twu.biblioteca;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class ParserTest {

    @Test
    public void inputShouldBeParsed() {
        HashMap<Integer, Options> menuOptions = new HashMap<>();
        Scanner consoleInput = new Scanner(System.in);
        ConsoleInputOutput consoleInputOutput = new ConsoleInputOutput(consoleInput);
        Books books = mock(Books.class);
        ListBooks listBooks=new ListBooks(consoleInputOutput, books);
        menuOptions.put(1, listBooks);
        Parser parser=new Parser(menuOptions);

        Options Actualoptions=parser.parse(1);

        assertEquals(listBooks,Actualoptions);



    }


}