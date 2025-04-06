package org.example.menu.item;

import org.example.menu.action.MenuItemAction;

public class MenuItem {
    private final String option;
    private final String description;
    private final Class<? extends MenuItemAction> actionClass;

    public MenuItem(String option, String description, Class<? extends MenuItemAction> actionClass) {
        this.option = option;
        this.description = description;
        this.actionClass = actionClass;
    }

    public String getOption() {
        return option;
    }

    public String getDescription() {
        return description;
    }

    public void execute() {
        MenuItemAction menuItemAction;

        try {
            menuItemAction = actionClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        menuItemAction.execute();
    }
}
