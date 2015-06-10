package com.twu.biblioteca;

public class ExitApp implements MenuInterface {

    @Override
    public void displayStrategy() {
        System.exit(0);
    }
}
