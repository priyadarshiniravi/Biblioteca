package com.twu.biblioteca;

public class Menu {
    private ConsoleInputOutput consoleInputOutput;
    private Parser parser;
    private MenuOption menuOption;
    private int EXIT_OPTION = 2;


    public Menu(ConsoleInputOutput consoleInputOutput, Parser parser, MenuOption menuOption) {
        this.consoleInputOutput = consoleInputOutput;
        this.parser = parser;
        this.menuOption = menuOption;
    }

    void chooseOption() {
        consoleInputOutput.print(menuOption.toString());
        int input = consoleInputOutput.getInputAsNumber();
        while (input != EXIT_OPTION) {

            Options option = parser.parse(input);
            if (option == null) {
                consoleInputOutput.print(Messages.INVALID_MESSAGE);
            } else {
                option.action();
            }
            consoleInputOutput.print(menuOption.toString());
            input = consoleInputOutput.getInputAsNumber();


        }
    }


}
