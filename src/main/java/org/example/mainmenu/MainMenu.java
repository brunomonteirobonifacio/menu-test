package org.example.mainmenu;

import org.example.menu.BaseMenu;
import org.example.menu.item.MenuItem;

import java.util.List;

public class MainMenu extends BaseMenu {

    @Override
    public List<MenuItem> getMenuItems() {
        return List.of(
                new MenuItem("1", "Say Hello World", HelloWorldItemAction.class),
                new MenuItem("2", "Say hi to mom", HiMomItemAction.class)
        );
    }
}
