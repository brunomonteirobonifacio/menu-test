package io.github.brunomonteirobonifacio.simplemenu.examples.foomenu;

import io.github.brunomonteirobonifacio.simplemenu.menu.AbstractMenu;
import io.github.brunomonteirobonifacio.simplemenu.menu.MenuItem;

import java.util.List;

public class FooMenu extends AbstractMenu {

    @Override
    public String getMenuTitle() {
        return "Foo Menu";
    }

    @Override
    protected List<MenuItem> loadMenuItems() {
        return List.of(
                new MenuItem("1", "Do bar", new BarItemAction()),
                new MenuItem("2", "Do bar 2", new BarItemAction())
        );
    }
}
