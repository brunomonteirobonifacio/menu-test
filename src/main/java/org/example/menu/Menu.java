package org.example.menu;

import org.example.menu.engine.MenuEngine;

import java.util.List;

public interface Menu {
    void renderOptions();
    void selectOption(String option);
    void executeSelectedOption(MenuEngine menuEngine);
}
