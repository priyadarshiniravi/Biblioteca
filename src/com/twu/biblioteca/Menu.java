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

    public int chooseOption(User user) {
        consoleInputOutput.print(menuOption.toString());
        int input = consoleInputOutput.getInputAsNumber();
        while (input != menuOption.isExitOption()) {

            Options option = parser.parse(input);
            if (option == null) {
                consoleInputOutput.print(Messages.INVALID_MESSAGE);
            } else {
                option.action(user);
            }
            consoleInputOutput.print(menuOption.toString());
            input = consoleInputOutput.getInputAsNumber();


        }
        consoleInputOutput.getInputAsString();
        return input;
    }


}
