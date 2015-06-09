package com.twu.biblioteca;

import java.io.IOException;
import java.util.HashMap;

public class Menu {
    HashMap<Integer, MenuInterface> menuItems = new HashMap();

    public Menu(BooksToConsole booksToConsole) {
        menuItems.put(1, new ListBooks(booksToConsole));
        menuItems.put(2,new ExitApp());
    }

    public void listenToOption(MenuToConsole menuDisplay) throws IOException {
        int optionAsInteger = menuDisplay.getMenuOption();
        if (menuItems.get(optionAsInteger)==null)
            System.out.println("Invalid Option");
        else
        menuItems.get(optionAsInteger).displayStrategy();
    }


}
