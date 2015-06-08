package com.twu.biblioteca;

public class MenuToConsole {
    String menu;
    public MenuToConsole(String menu)
    {
        this.menu=menu;
    }

    public void displayMenu() {
        System.out.println(menu);
    }

}
