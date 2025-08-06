package io.github.brunomonteirobonifacio.simplemenu.examples.mainmenu;

import io.github.brunomonteirobonifacio.simplemenu.menu.action.MenuItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

public class HiMomItemAction implements MenuItemAction {
    @Override
    public void execute(MenuEngine engine) {
        System.out.println("Hi, mom!");
    }
}
