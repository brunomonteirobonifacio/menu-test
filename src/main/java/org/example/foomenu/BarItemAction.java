package org.example.foomenu;

import org.example.menu.action.MenuItemAction;

public class BarItemAction implements MenuItemAction {
    @Override
    public void execute() {
        System.out.println("Done bar item action");
    }
}
