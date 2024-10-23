package ru.ldv236.patterns.creational.abstractFactory.components;

// Реализация кнопки для MacOS
public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a MacOS button.");
    }
}