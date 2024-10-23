package ru.ldv236.patterns.creational.abstractFactory.components;

// Реализация кнопки для Windows
public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a Windows button.");
    }
}
