package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MenuOptionTest {
    @Test
    public void ShouldBeStringOfMenuOption() {
        ArrayList<String> options = new ArrayList<>();
        options.add("Display Books");
        options.add("Exit");
        MenuOption menuOption = new MenuOption(options);

        String actualString = menuOption.toString();

        assertEquals("\n1Display Books\n2Exit", actualString);
    }

    @Test
    public void ShouldExitMenuOption() {
        ArrayList<String> options = new ArrayList<>();
        options.add("Display Books");
        options.add("Exit");
        options.add("ListBook");
        MenuOption menuOption = new MenuOption(options);

        int actualString = menuOption.isExitOption();

        assertEquals(2, actualString);
    }

    @Test
    public void ShouldLogoutMenuOption() {
        ArrayList<String> options = new ArrayList<>();
        options.add("Display Books");
        options.add("Exit");
        options.add("ListBook");
        options.add("Logout");
        MenuOption menuOption = new MenuOption(options);

        int actualString = menuOption.isLogoutOption();

        assertEquals(4, actualString);
    }

}