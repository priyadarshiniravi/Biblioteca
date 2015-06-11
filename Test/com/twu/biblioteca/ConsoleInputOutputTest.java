package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.Assert.*;

public class ConsoleInputOutputTest {
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());

    @Before
    public void setUpStreams() {
        System.setIn(in);
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void ShouldGetUserInput() {

        ConsoleInputOutput consoleInputOutput = new ConsoleInputOutput(new Scanner(System.in));

        int actualInput=consoleInputOutput.getInput();

        assertEquals(1,actualInput);


    }
}
