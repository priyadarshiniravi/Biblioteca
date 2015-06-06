package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

public class OutputMessagesTest {
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldDisplayWelcomeMessage() {
        OutputMessages system = new OutputMessages();

        system.displayWelcomeMessage();

        assertEquals("Welcome To Biblioteca!!!\n", outContent.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);

    }

}