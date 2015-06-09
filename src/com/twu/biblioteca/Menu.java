package com.twu.biblioteca;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Menu {
    HashMap<Integer, MenuListener> menuItems = new HashMap<Integer, MenuListener>();

    public Menu(BooksToConsole booksToConsole) {
        menuItems.put(1, new ListBooks(booksToConsole));
    }

    public void listenToOption(MenuToConsole menuDisplay) throws IOException {
        int optionAsInteger = menuDisplay.getMenuOption();
        menuItems.get(optionAsInteger).displayStrategy();
    }


}
