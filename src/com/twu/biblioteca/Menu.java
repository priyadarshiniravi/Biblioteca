package com.twu.biblioteca;

public class Menu {
    ConsoleInputOutput consoleInputOutput;
    Parser parser;
    MenuOption menuOption;

    public Menu(ConsoleInputOutput consoleInputOutput, Parser parser, MenuOption menuOption) {
        this.consoleInputOutput = consoleInputOutput;
        this.parser = parser;
        this.menuOption = menuOption;
    }

    void chooseOption() {
        consoleInputOutput.print(menuOption.toString());
        int input = consoleInputOutput.getInputAsNumber();
        while (input != 2) {

            Options option = parser.parse(input);
            if (option == null) {
                consoleInputOutput.print(Messages.INVALID_MESSAGE);
            } else {
                option.displayStrategy();
            }
            consoleInputOutput.print(menuOption.toString());
            input = consoleInputOutput.getInputAsNumber();


        }
    }


}
