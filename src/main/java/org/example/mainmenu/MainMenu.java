package org.example.mainmenu;

import org.example.menu.BaseMenu;
import org.example.menu.MenuItem;

import java.util.List;

public class MainMenu extends AbstractMenu {

    @Override
    public List<MenuItem> getMenuItems() {
    protected List<MenuItem> loadMenuItems() {
        return List.of(
                new MenuItem("1", "Say Hello World", HelloWorldItemAction.class),
                new MenuItem("2", "Say hi to mom", HiMomItemAction.class)
        );
    }
}
