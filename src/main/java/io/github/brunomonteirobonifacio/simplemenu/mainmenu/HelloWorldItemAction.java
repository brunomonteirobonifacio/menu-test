package io.github.brunomonteirobonifacio.simplemenu.mainmenu;

import io.github.brunomonteirobonifacio.simplemenu.menu.action.MenuItemAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

public class HelloWorldItemAction implements MenuItemAction {

    @Override
    public void execute(MenuEngine engine) {
        System.out.println("Hello World!");
    }
}
