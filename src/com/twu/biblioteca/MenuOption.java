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

    public int isExitOption() {
        int iterator = 1;
        for (String IndividualOption : menuOptions) {
            if (IndividualOption == "Exit")
                return iterator;
            iterator++;

        }
        return getInfinity();

    }

    public int isLogoutOption() {
        int iterator = 1;
        for (String IndividualOption : menuOptions) {
            if (IndividualOption == "Logout")
                return iterator;
            iterator++;

        }
        return getInfinity();

    }

    private int getInfinity() {
        return Integer.MAX_VALUE;
    }


}
