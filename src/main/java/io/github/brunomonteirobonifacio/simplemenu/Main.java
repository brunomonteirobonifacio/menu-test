package io.github.brunomonteirobonifacio.simplemenu;

import io.github.brunomonteirobonifacio.simplemenu.mainmenu.MainMenu;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

public class Main {
    public static void main(String[] args) {
        new MenuEngine(new MainMenu()).run();
    }
}