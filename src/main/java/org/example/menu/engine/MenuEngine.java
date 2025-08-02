package org.example.menu.engine;

import org.example.menu.Menu;
import org.example.menu.MenuItem;

import java.util.Scanner;
import java.util.Stack;

public class MenuEngine {
    private final Stack<Menu> menuStack = new Stack<>();
    private final Scanner scanner = new Scanner(System.in);

    public MenuEngine(Menu initialMenu) {
        menuStack.push(initialMenu);
    }

    public void navigateTo(Menu menu) {
        menuStack.push(menu);
    }

    public void back() {
        if (!menuStack.isEmpty()) {
            menuStack.pop();
        }
    }

    public void run() {
        while (!menuStack.isEmpty()) {
            Menu currentMenu = menuStack.peek();

            System.out.println("\n=============== " + currentMenu.getMenuTitle() + " ===============");

            for (MenuItem menuItem : currentMenu.getMenuItems()) {
                System.out.printf("[ %s ] %s" + "\n", menuItem.getOption(), menuItem.getDescription());
            }

            System.out.print("Select an option: ");

            try {
                currentMenu.selectOption(scanner.next());
                currentMenu.executeSelectedOption(this);
            } catch (IllegalArgumentException e) {
                System.out.println("An invalid option was selected.");
            }
        }
    }
}
