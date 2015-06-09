package com.twu.biblioteca;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class MenuToConsole {
    String menu;


    public MenuToConsole(String menu) {
        this.menu = menu;
    }

    public void displayMenu() {
        System.out.println(menu);
    }

    public int getMenuOption() throws IOException {
        Scanner in = new Scanner(System.in);
        int option = in.nextInt();
        return option;
    }

}
