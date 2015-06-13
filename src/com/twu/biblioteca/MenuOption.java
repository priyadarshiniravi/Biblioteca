package com.twu.biblioteca;

import java.util.ArrayList;

public class MenuOption {
    private ArrayList<String> menuOptions;

    public MenuOption(ArrayList<String> menuOptions) {
        this.menuOptions = menuOptions;
    }

    @Override
    public String toString() {
        String DisplayOption = "";
        int iterator = 1;
        for (String IndividualOption : menuOptions) {
            DisplayOption = DisplayOption + "\n" + iterator + IndividualOption;
            iterator++;

        }
        return DisplayOption;
    }
}
