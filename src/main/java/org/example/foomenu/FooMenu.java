package org.example.foomenu;

import org.example.menu.BaseMenu;
import org.example.menu.MenuItem;

import java.util.List;

public class FooMenu extends BaseMenu {

    @Override
    public List<MenuItem> getMenuItems() {
        return List.of(
                new MenuItem("1", "Do bar", BarItemAction.class),
                new MenuItem("2", "Do bar 2", BarItemAction.class)
        );
    }
}
