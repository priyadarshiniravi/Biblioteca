package com.twu.biblioteca;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class MenuToConsole {
    String menu;
    int option;

    public MenuToConsole(String menu) {
        this.menu = menu;
    }

    public void displayMenu() {
        System.out.println(menu);
    }

    public int getMenuOption(InputStream ByteArrayInputStream) throws IOException {
        Scanner in = new Scanner(ByteArrayInputStream);
        option = in.nextInt();
        return option;
    }

}
