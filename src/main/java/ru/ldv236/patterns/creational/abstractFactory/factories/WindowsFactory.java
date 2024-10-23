package ru.ldv236.patterns.creational.abstractFactory.factories;

import ru.ldv236.patterns.creational.abstractFactory.main.GUIFactory;
import ru.ldv236.patterns.creational.abstractFactory.components.Button;
import ru.ldv236.patterns.creational.abstractFactory.components.Checkbox;
import ru.ldv236.patterns.creational.abstractFactory.components.WindowsButton;
import ru.ldv236.patterns.creational.abstractFactory.components.WindowsCheckbox;

// Фабрика для Windows
public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}