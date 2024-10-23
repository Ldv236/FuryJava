package ru.ldv236.patterns.creational.abstractFactory.components;

// Реализация чекбокса для Windows
public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering a Windows checkbox.");
    }
}