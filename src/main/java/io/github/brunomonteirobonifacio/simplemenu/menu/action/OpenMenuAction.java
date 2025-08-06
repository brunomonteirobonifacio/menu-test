package io.github.brunomonteirobonifacio.simplemenu.menu.action;


import io.github.brunomonteirobonifacio.simplemenu.menu.Menu;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

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
