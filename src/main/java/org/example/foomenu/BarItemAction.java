package org.example.foomenu;

import org.example.menu.engine.MenuEngine;
import org.example.menu.action.MenuItemAction;

public class BarItemAction implements MenuItemAction {
    @Override
    public void execute(MenuEngine engine) {
        System.out.println("Done bar item action");
    }
}
