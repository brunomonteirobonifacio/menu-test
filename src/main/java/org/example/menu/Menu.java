package org.example.menu;

import org.example.menu.engine.MenuEngine;

import java.util.List;

public interface Menu {
    String getMenuTitle();
    List<MenuItem> getMenuItems();
    void selectOption(String option);
    void executeSelectedOption(MenuEngine menuEngine);
}
