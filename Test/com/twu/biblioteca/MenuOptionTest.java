package com.twu.biblioteca;

import org.junit.Test;

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