package org.example.mainmenu;

import org.example.foomenu.FooMenu;
import org.example.menu.AbstractMenu;
import org.example.menu.MenuItem;
import org.example.menu.OpenMenuAction;

import java.util.List;

public class MainMenu extends AbstractMenu {

    @Override
    public String getMenuTitle() {
        return "Main Menu";
    }

    @Override
    protected List<MenuItem> loadMenuItems() {
        return List.of(
                new MenuItem("1", "Say Hello World", HelloWorldItemAction.class),
                new MenuItem("2", "Say hi to mom", HiMomItemAction.class)
        );
    }
}
