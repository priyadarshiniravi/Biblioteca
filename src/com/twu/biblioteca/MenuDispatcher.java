package com.twu.biblioteca;

public class MenuDispatcher implements MenuDispacherInteface {
    Menu invalidUserMenu;
    Menu validUserMenu;
    Menu librarianMenu;

    public MenuDispatcher(Menu invalidUserMenu, Menu validUserMenu, Menu librarianMenu) {
        this.invalidUserMenu = invalidUserMenu;
        this.validUserMenu = validUserMenu;
        this.librarianMenu = librarianMenu;
    }

    @Override
    public void callMenu(ValidUser user) {
        validUserMenu.chooseOption();
    }


    public void callMenu(InvalidUser user){
        invalidUserMenu.chooseOption();
    }


}
