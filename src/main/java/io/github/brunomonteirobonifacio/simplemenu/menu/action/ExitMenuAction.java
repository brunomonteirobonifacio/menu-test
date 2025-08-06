package io.github.brunomonteirobonifacio.simplemenu.menu.action;

import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

public class ExitMenuAction implements MenuItemAction {

    @Override
    public void execute(MenuEngine engine) {
        engine.back();
    }
}
