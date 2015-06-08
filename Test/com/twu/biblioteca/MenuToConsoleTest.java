package com.twu.biblioteca;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MenuToConsoleTest {
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldDisplayMenu() {
        MenuToConsole system = new MenuToConsole("1.List Books");

        system.displayMenu();

        Assert.assertEquals("1.List Books\n", outContent.toString());
    }


    @After
    public void cleanUpStreams() {
        System.setOut(null);

    }

}