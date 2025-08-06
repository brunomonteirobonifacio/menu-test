package io.github.brunomonteirobonifacio.simplemenu.examples.mainmenu;

import io.github.brunomonteirobonifacio.simplemenu.examples.foomenu.FooMenu;
import io.github.brunomonteirobonifacio.simplemenu.examples.notitlemenu.NoTitleMenu;
import io.github.brunomonteirobonifacio.simplemenu.menu.AbstractMenu;
import io.github.brunomonteirobonifacio.simplemenu.menu.MenuItem;
import io.github.brunomonteirobonifacio.simplemenu.menu.action.OpenMenuAction;

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
