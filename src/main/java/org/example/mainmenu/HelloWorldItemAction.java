package org.example.mainmenu;

import org.example.menu.action.MenuItemAction;

public class HelloWorldItemAction implements MenuItemAction {
    public void execute() {
        System.out.println("Hello World!");
    }
}
