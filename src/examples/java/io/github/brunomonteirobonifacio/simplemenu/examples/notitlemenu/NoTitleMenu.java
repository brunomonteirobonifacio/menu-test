package io.github.brunomonteirobonifacio.simplemenu.examples.notitlemenu;

import io.github.brunomonteirobonifacio.simplemenu.menu.AbstractMenu;
import io.github.brunomonteirobonifacio.simplemenu.menu.MenuItem;

import java.util.List;

public class NoTitleMenu extends AbstractMenu {

    @Override
    protected List<MenuItem> loadMenuItems() {
        return List.of(
                new MenuItem("1", "You can use Lambdas, but they look messier in this scenario", (_) -> {
                    System.out.println("Lambda Action");
                })
        );
    }

    @Override
    protected String getExitItemDescription() {
        return "Go back";
    }
}
