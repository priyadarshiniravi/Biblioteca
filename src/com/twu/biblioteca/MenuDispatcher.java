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


    public int callMenu(ValidUser user,Login login) {
        return validUserMenu.chooseOption(user,login);
    }

    public int callMenu(InvalidUser user,Login login) {
        return invalidUserMenu.chooseOption(user,login);
    }

    public int callMenu(LibrarianUser user,Login login) {
        return librarianMenu.chooseOption(user,login);
    }


}
