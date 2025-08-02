package org.example.menu;

import org.example.menu.engine.MenuEngine;

public class MenuItem {
    private final String option;
    private final String description;
    private final MenuItemAction action;

    public MenuItem(String option, String description, MenuItemAction action) {
        this.option = option;
        this.description = description;
        this.action = action;
    }

    public String getOption() {
        return option;
    }

    public String getDescription() {
        return description;
    }

    public void execute(MenuEngine engine) {
        action.execute(engine);
    }
}
