package com.twu.biblioteca;

import junit.framework.TestCase;
import junit.framework.TestResult;
import org.junit.Test;
import org.mockito.internal.matchers.Equals;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MenuOptionTest {
    @Test
    public void ShouldBeStringOfMenuOption()
    {
        ArrayList<String> options=new ArrayList<>();
        options.add("Display Books");
        options.add("Exit");
        MenuOption menuOption=new MenuOption(options);

        String actualString=menuOption.toString();

        assertEquals("\n1Display Books\n2Exit",actualString);
    }
}