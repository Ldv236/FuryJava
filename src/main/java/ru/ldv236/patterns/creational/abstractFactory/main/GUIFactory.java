package ru.ldv236.patterns.creational.abstractFactory.main;

import ru.ldv236.patterns.creational.abstractFactory.components.Button;
import ru.ldv236.patterns.creational.abstractFactory.components.Checkbox;

// Абстрактная фабрика для создания компонентов
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}