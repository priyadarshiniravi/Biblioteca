package com.twu.biblioteca;

public class MenuDispatcher {
    Menu invalidUserMenu;
    Menu validUserMenu;
    Menu librarianMenu;

    public MenuDispatcher(Menu invalidUserMenu, Menu validUserMenu, Menu librarianMenu) {
        this.invalidUserMenu = invalidUserMenu;
        this.validUserMenu = validUserMenu;
        this.librarianMenu = librarianMenu;
    }


    public int callMenu(ValidUser user) {
        return validUserMenu.chooseOption(user);
    }

    public int callMenu(InvalidUser user) {
        return invalidUserMenu.chooseOption(user);
    }


}
