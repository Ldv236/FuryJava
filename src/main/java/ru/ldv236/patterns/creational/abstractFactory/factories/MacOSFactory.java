package ru.ldv236.patterns.creational.abstractFactory.factories;

import ru.ldv236.patterns.creational.abstractFactory.components.MacOSButton;
import ru.ldv236.patterns.creational.abstractFactory.components.MacOSCheckbox;
import ru.ldv236.patterns.creational.abstractFactory.main.GUIFactory;
import ru.ldv236.patterns.creational.abstractFactory.components.Button;
import ru.ldv236.patterns.creational.abstractFactory.components.Checkbox;

// Фабрика для MacOS
public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}