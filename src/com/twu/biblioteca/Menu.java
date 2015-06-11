package com.twu.biblioteca;

import java.io.IOException;
import java.util.HashMap;

public class Menu {
    ConsoleInputOutput consoleInputOutput;
    Parser parser;

    public Menu(ConsoleInputOutput consoleInputOutput, Parser parser) {
        this.consoleInputOutput = consoleInputOutput;
        this.parser = parser;
    }

    void chooseOption() {
        int input = consoleInputOutput.getInput();
        Options option = parser.parse(input);
        option.displayStrategy();


    }


}
