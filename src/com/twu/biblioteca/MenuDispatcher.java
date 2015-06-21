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


    public int callMenu(ValidUser user,Login login,MenuDispatcher menuDispatcher) {
        return validUserMenu.chooseOption(user,login,menuDispatcher);
    }

    public int callMenu(InvalidUser user,Login login,MenuDispatcher menuDispatcher) {
        return invalidUserMenu.chooseOption(user,login,menuDispatcher);
    }

    public int callMenu(LibrarianUser user,Login login,MenuDispatcher menuDispatcher) {
        return librarianMenu.chooseOption(user,login,menuDispatcher);
    }


}
