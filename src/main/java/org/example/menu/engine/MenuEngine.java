package org.example.menu.engine;

import org.example.menu.Menu;
import org.example.menu.MenuItem;

import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class MenuEngine {
    private final Stack<Menu> menuStack = new Stack<>();
    private final Scanner scanner = new Scanner(System.in);

    public MenuEngine(Menu initialMenu) {
        menuStack.push(Objects.requireNonNull(initialMenu, "Initial menu cannot be null"));
    }

    public void navigateTo(Menu menu) {
        menuStack.push(Objects.requireNonNull(menu, "Menu to navigate to cannot be null"));
    }

    public void back() {
        if (!menuStack.isEmpty()) {
            menuStack.pop();
        }
    }

    public void run() {
        while (!menuStack.isEmpty()) {
            Menu currentMenu = menuStack.peek();


            String currentMenuTitle = currentMenu.getMenuTitle();
            if (currentMenuTitle == null || currentMenuTitle.isEmpty()) {
                System.out.println("\n==================================");
            } else {
                System.out.println("\n=============== " + currentMenuTitle + " ===============");
            }

            for (MenuItem menuItem : currentMenu.getMenuItems()) {
                System.out.printf("[ %s ] %s" + "\n", menuItem.getOption(), menuItem.getDescription());
            }

            System.out.print(getOptionSelectionMessage());

            try {
                currentMenu.selectOption(scanner.next());
                currentMenu.executeSelectedOption(this);
            } catch (IllegalArgumentException e) {
                System.out.println("An invalid option was selected.");
            }
        }
    }

    protected String getOptionSelectionMessage() {
        return "Select an option: ";
    }
}
