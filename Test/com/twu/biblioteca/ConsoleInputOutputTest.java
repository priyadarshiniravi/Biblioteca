package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static junit.framework.TestCase.assertEquals;

public class ConsoleInputOutputTest {
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();


    @Before
    public void setUpStreams() {

        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void ShouldGetUserInputNumber() {
        ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
        System.setIn(in);
        ConsoleInputOutput consoleInputOutput = new ConsoleInputOutput(new Scanner(System.in));

        int actualInput = consoleInputOutput.getInputAsNumber();

        assertEquals(1, actualInput);


    }

    @Test
    public void ShouldHandleInputException() {
        ByteArrayInputStream in = new ByteArrayInputStream("aabbbb".getBytes());
        System.setIn(in);
        ConsoleInputOutput consoleInputOutput = new ConsoleInputOutput(new Scanner(System.in));

        int actualInput = consoleInputOutput.getInputAsNumber();

        assertEquals(-1, actualInput);


    }

    @Test
    public void ShouldGetUserInputString() {
        ByteArrayInputStream in = new ByteArrayInputStream("String".getBytes());
        System.setIn(in);
        ConsoleInputOutput consoleInputOutput = new ConsoleInputOutput(new Scanner(System.in));

        String actualInput = consoleInputOutput.getInputAsString();

        assertEquals("String", actualInput);


    }

    @Test
    public void ShouldDisplayOutputToUser() {
        ConsoleInputOutput consoleInputOutput = new ConsoleInputOutput(new Scanner(System.in));

        consoleInputOutput.print(Messages.WELCOME_MESSAGE);

        assertEquals(Messages.WELCOME_MESSAGE + "\n", outContent.toString());


    }
}
