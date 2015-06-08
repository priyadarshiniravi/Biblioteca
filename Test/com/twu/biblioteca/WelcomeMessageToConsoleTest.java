package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;


public class WelcomeMessageToConsoleTest {
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldDisplayWelcomeMessage() {
        WelcomeMessageToConsole system = new WelcomeMessageToConsole("Welcome To Biblioteca!!!");

        system.displayWelcomeMessage();

        assertEquals("Welcome To Biblioteca!!!\n", outContent.toString());
    }



}