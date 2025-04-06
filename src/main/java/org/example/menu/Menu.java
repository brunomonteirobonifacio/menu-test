package org.example.menu;

public interface Menu {
    void renderOptions();
    void selectOption(String option);
    void executeSelectedOption();
}
