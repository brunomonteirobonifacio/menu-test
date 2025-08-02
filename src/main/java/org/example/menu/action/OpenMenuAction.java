package org.example.menu.action;


import org.example.menu.Menu;
import org.example.menu.engine.MenuEngine;

public class OpenMenuAction implements MenuItemAction {
    private final Menu menuToOpen;

    public OpenMenuAction(Menu menuToOpen) {
        this.menuToOpen = menuToOpen;
    }

    @Override
    public void execute(MenuEngine engine) {
        engine.navigateTo(menuToOpen);
    }
}
