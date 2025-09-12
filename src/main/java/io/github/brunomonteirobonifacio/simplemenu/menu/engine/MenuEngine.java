package io.github.brunomonteirobonifacio.simplemenu.menu.engine;

import io.github.brunomonteirobonifacio.simplemenu.menu.Menu;
import io.github.brunomonteirobonifacio.simplemenu.menu.MenuItem;

import java.util.*;

public class MenuEngine {
    private final Stack<Menu> menuStack = new Stack<>();
    private final Scanner scanner = new Scanner(System.in);
    private static ResourceBundle bundle;

    static {
        loadResourceBundle();
    }

    private static void loadResourceBundle() {
        if (bundle == null) {
            try {
                bundle = ResourceBundle.getBundle("menu");
            } catch (MissingResourceException e) {
                bundle = ResourceBundle.getBundle("menu", Locale.US);
            }
        }
    }

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

            printMenuTitle(currentMenu);
            printMenuOptions(currentMenu);

            System.out.print(getOptionSelectionMessage());

            try {
                currentMenu.selectOption(scanner.next());
                scanner.nextLine();

                currentMenu.executeSelectedOption(this);
            } catch (IllegalArgumentException e) {
                System.out.println(getInvalidOptionSelectedMessage());
            }
        }
    }

    private void printMenuTitle(Menu menu) {
        String menuTitle = menu.getMenuTitle();
        if (menuTitle == null || menuTitle.isEmpty()) {
            System.out.println("\n==================================");
        } else {
            System.out.println("\n=============== " + menuTitle + " ===============");
        }
    }

    private void printMenuOptions(Menu menu) {
        for (MenuItem menuItem : menu.getMenuItems()) {
            System.out.printf("[ %s ] %s" + "\n", menuItem.getOption(), menuItem.getDescription());
        }

    }

    private String getOptionSelectionMessage() {
        return bundle.getString("selectOptionLabel") + " ";
    }

    private String getInvalidOptionSelectedMessage() {
        return bundle.getString("invalidOptionSelectedLabel");
    }

    public String promptString(String label) {
        System.out.print(label);
        return scanner.nextLine();
    }

    public int promptInt(String label) {
        System.out.print(label);

        int value = scanner.nextInt();
        scanner.nextLine();

        return value;
    }

    public double promptDouble(String label) {
        System.out.print(label);

        double value = scanner.nextDouble();
        scanner.nextLine();

        return value;
    }

    public float promptFloat(String label) {
        System.out.print(label);

        float value = scanner.nextFloat();
        scanner.nextLine();

        return value;
    }
}
