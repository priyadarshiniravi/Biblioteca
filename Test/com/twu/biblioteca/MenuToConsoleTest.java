package com.twu.biblioteca;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import java.io.*;

public class MenuToConsoleTest {
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());

    @Before
    public void setUpStreams() {
        System.setIn(in);
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldDisplayMenu() {
        MenuToConsole system = new MenuToConsole("1.List Books");

        system.displayMenu();

        Assert.assertEquals("1.List Books\n", outContent.toString());
    }

    @Test
    public void ShouldTakeInput() throws IOException {
        MenuToConsole system = new MenuToConsole("1.List Books");

        Assert.assertEquals(1, system.getMenuOption());

    }


    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setIn(System.in);

    }

}