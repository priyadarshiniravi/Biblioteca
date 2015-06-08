package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;


public class OutputToConsoleTest {
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldDisplayWelcomeMessage() {
        OutputToConsole system = new OutputToConsole();

        system.displayWelcomeMessage();

        assertEquals("Welcome To Biblioteca!!!\n", outContent.toString());
    }

    @Test
    public void shouldDisplayMenu() {
        OutputToConsole system = new OutputToConsole();

        system.displayMenu();

        assertEquals("1.List Books\n", outContent.toString());
    }


    @After
    public void cleanUpStreams() {
        System.setOut(null);

    }

}