package org.example;

import org.example.mainmenu.MainMenu;
import org.example.menu.engine.MenuEngine;

public class Main {
    public static void main(String[] args) {
        new MenuEngine(new MainMenu()).run();
    }
}