package io.github.brunomonteirobonifacio.simplemenu.examples;

import io.github.brunomonteirobonifacio.simplemenu.examples.mainmenu.MainMenu;
import io.github.brunomonteirobonifacio.simplemenu.menu.engine.MenuEngine;

public class Main {
    public static void main(String[] args) {
        new MenuEngine(new MainMenu()).run();
    }
}