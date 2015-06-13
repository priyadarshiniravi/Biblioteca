package com.twu.biblioteca;

import java.util.HashMap;

public class Parser {
    private HashMap<Integer, Options> MenuOptions;

    Parser(HashMap<Integer, Options> MenuOption) {
        this.MenuOptions = MenuOption;
    }


    public Options parse(int input) {
        return MenuOptions.get(input);
    }
}
