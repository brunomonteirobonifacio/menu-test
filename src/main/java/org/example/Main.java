package org.example;

import org.example.foomenu.FooMenu;
import org.example.mainmenu.MainMenu;
import org.example.menu.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new MainMenu();

        menu.renderOptions();
        System.out.print("Selecione a opção desejada: ");

        menu.selectOption(scanner.next());
        menu.executeSelectedOption();
    }
}