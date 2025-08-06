package io.github.brunomonteirobonifacio.simplemenu.foomenu;

import io.github.brunomonteirobonifacio.simplemenu.menu.action.MenuItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

public class BarItemAction implements MenuItemAction {
    @Override
    public void execute(MenuEngine engine) {
        System.out.println("Done bar item action");
    }
}
