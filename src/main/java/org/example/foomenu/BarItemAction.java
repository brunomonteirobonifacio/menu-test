package org.example.foomenu;

import org.example.menu.MenuItemAction;

public class BarItemAction implements MenuItemAction {
    @Override
    public void execute() {
        System.out.println("Done bar item action");
    }
}
