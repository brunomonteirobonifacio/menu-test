package org.example.mainmenu;

import org.example.menu.engine.MenuEngine;
import org.example.menu.action.MenuItemAction;

public class HiMomItemAction implements MenuItemAction {
    @Override
    public void execute(MenuEngine engine) {
        System.out.println("Hi, mom!");
    }
}
