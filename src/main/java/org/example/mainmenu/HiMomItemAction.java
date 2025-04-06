package org.example.mainmenu;

import org.example.menu.action.MenuItemAction;

public class HiMomItemAction implements MenuItemAction {
    @Override
    public void execute() {
        System.out.println("Hi, mom!");
    }
}
