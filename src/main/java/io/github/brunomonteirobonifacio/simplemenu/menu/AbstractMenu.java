package io.github.brunomonteirobonifacio.simplemenu.menu;

import io.github.brunomonteirobonifacio.simplemenu.menu.action.ExitMenuAction;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

import java.util.*;

public abstract class AbstractMenu implements Menu {
    protected final Map<String, MenuItem> itemsByOption = new HashMap<>();
    protected final List<MenuItem> menuItems = new ArrayList<>();
    protected MenuItem selectedItem;
    private static ResourceBundle bundle;

    static {
        loadResourceBundle();
    }

    private void addExitItem() {
        removeMenuItemWithSameOptionAsExit();
        menuItems.add(new MenuItem("x", getExitItemDescription(), new ExitMenuAction()));
    }

    private static void loadResourceBundle() {
        if (bundle == null) {
            try {
                bundle = ResourceBundle.getBundle("menu");
            } catch (MissingResourceException e) {
                bundle = ResourceBundle.getBundle("menu", Locale.US);
            }
        }
    }

    public AbstractMenu() {
        menuItems.addAll(loadMenuItems());
        addExitItem();
        menuItems.forEach(i -> itemsByOption.put(i.getOption(), i));
    }

    private void removeMenuItemWithSameOptionAsExit() {
        menuItems.removeIf(item -> item.getOption().equalsIgnoreCase("x"));
    }

    private String getExitItemDescription() {
        return bundle.getString("exitLabel");
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
