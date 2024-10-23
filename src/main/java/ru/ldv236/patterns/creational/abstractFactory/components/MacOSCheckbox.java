package ru.ldv236.patterns.creational.abstractFactory.components;

// Реализация чекбокса для MacOS
public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering a MacOS checkbox.");
    }
}