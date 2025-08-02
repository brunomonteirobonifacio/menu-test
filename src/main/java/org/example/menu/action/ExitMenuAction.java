package org.example.menu.action;

import org.example.menu.engine.MenuEngine;

public class ExitMenuAction implements MenuItemAction {

    @Override
    public void execute(MenuEngine engine) {
        engine.back();
    }
}
