package org.example.menu;

import org.example.menu.engine.MenuEngine;

import java.util.*;

public abstract class AbstractMenu implements Menu {
    protected final Map<String, MenuItem> itemsByOption = new HashMap<>();
    protected final List<MenuItem> menuItems = new ArrayList<>();
    protected MenuItem selectedItem;

    public AbstractMenu() {
        menuItems.addAll(loadMenuItems());
        addExitOption();
        menuItems.forEach(i -> itemsByOption.put(i.getOption(), i));
    }

    private void addExitOption() {
        removeMenuItemWithSameOptionAsExit();
        menuItems.add(new MenuItem("x", "Exit", new ExitMenuAction()));
    }

    private void removeMenuItemWithSameOptionAsExit() {
        menuItems.removeIf(item -> item.getOption().equalsIgnoreCase("x"));
    }

    @Override
    public List<MenuItem> getMenuItems() {
        return menuItems;
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

    protected abstract List<MenuItem> loadMenuItems();
}
