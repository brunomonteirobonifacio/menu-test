package io.github.brunomonteirobonifacio.simplemenu.menu;

import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

import java.util.List;

public interface Menu {
    List<MenuItem> getMenuItems();
    void selectOption(String option);
    void executeSelectedOption(MenuEngine menuEngine);

    default String getMenuTitle() {
        return null;
    }
}
