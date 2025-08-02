package org.example.menu;

import org.example.menu.engine.MenuEngine;

import java.util.*;

public abstract class BaseMenu implements Menu {
    protected final Map<String, MenuItem> itemsByOption = new HashMap<>();
    protected final List<MenuItem> menuItems = new ArrayList<>();
    protected MenuItem selectedItem;

    public BaseMenu() {
        menuItems.addAll(getMenuItems());

        menuItems.forEach(i -> itemsByOption.put(i.getOption(), i));
    }

    public void renderOptions() {
        customRenderOptions("[ %s ] %s");
    }

    public void customRenderOptions(String templateString) {
        for (MenuItem menuItem : menuItems) {
            System.out.printf(templateString + "\n", menuItem.getOption(), menuItem.getDescription());
        }
    }

    @Override
    public void executeSelectedOption(MenuEngine engine) {
        if (selectedItem == null) {
            throw new IllegalStateException("No item selected to execute");
        }
        selectedItem.execute(engine);
    }

    public void selectOption(String option) {
        selectedItem = itemsByOption.get(option);

        if (selectedItem == null) {
            throw new IllegalArgumentException("The selected option '" + option + "' does not exist");
        }
    }

    public abstract List<MenuItem> getMenuItems();
}
