package org.example.mainmenu;

import org.example.NoTitleMenu;
import org.example.foomenu.FooMenu;
import org.example.menu.AbstractMenu;
import org.example.menu.MenuItem;
import org.example.menu.action.OpenMenuAction;

import java.util.List;

public class MainMenu extends AbstractMenu {

    @Override
    public String getMenuTitle() {
        return "Main Menu";
    }

    @Override
    protected List<MenuItem> loadMenuItems() {
        return List.of(
                new MenuItem("1", "Say Hello World", new HelloWorldItemAction()),
                new MenuItem("2", "Say hi to mom", new HiMomItemAction()),
                new MenuItem("3", "Open Foo Menu", new OpenMenuAction(new FooMenu())),
                new MenuItem("4", "Open no title menu", new OpenMenuAction(new NoTitleMenu()))
        );
    }
}
