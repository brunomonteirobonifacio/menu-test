package org.example.menu;


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
