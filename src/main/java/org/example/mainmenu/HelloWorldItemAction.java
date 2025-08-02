package org.example.mainmenu;

import org.example.menu.engine.MenuEngine;
import org.example.menu.MenuItemAction;

public class HelloWorldItemAction implements MenuItemAction {

    @Override
    public void execute(MenuEngine engine) {
        System.out.println("Hello World!");
    }
}
