package ru.ldv236.patterns.creational.abstractFactory.main;

import ru.ldv236.patterns.creational.abstractFactory.components.Button;
import ru.ldv236.patterns.creational.abstractFactory.components.Checkbox;
import ru.ldv236.patterns.creational.abstractFactory.factories.MacOSFactory;
import ru.ldv236.patterns.creational.abstractFactory.factories.WindowsFactory;

import java.util.HashMap;
import java.util.Map;

public class Application {
    private Button button;
    private Checkbox checkbox;

    // Клиентский код получает фабрику в зависимости от платформы
    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }

    public static void main(String[] args) {
        // Определяем, какая платформа (например, Windows)
        String osName = "Windows"; // В реальной программе можно получить это из системных настроек
//        String osName = "MacOS"; // В реальной программе можно получить это из системных настроек
        GUIFactory factory;

        Map<String, GUIFactory> factories = new HashMap<>();
        factories.put("Windows", new WindowsFactory());
        factories.put("MacOS", new MacOSFactory());

//        if (osName.equals("Windows")) {
//            factory = new WindowsFactory();
//        } else {
//            factory = new MacOSFactory();
//        }
        factory = factories.get(osName);

        // Создаём приложение с нужной фабрикой
        Application app = new Application(factory);
        app.paint();  // Вывод: Rendering a Windows button. Rendering a Windows checkbox.
    }
}
// Объяснение:
// Абстрактная фабрика (GUIFactory) предоставляет интерфейс для создания объектов (в данном случае, кнопки и чекбокса).
// Но сами конкретные объекты создаются в подклассах (WindowsFactory и MacOSFactory).
//
// Конкретные фабрики (WindowsFactory, MacOSFactory) создают семейство связанных объектов
// (например, кнопку и чекбокс для конкретной платформы).
// Эти объекты совместимы друг с другом и предназначены для использования в одной системе (Windows или MacOS).
//
// Клиентский код (класс Application) использует фабрику для создания объектов, не зная о конкретных их реализациях.
// Клиентский код становится независимым от конкретных типов создаваемых объектов.
//
// Когда применять Абстрактную фабрику:
// Когда система должна быть независимой от того, как создаются, компонуются и представляются её продукты.
// Когда необходимо создавать семейства связанных объектов, и это нужно делать совместно.
// Когда требуется обеспечить согласованность продуктов, чтобы объекты из одной фабрики могли корректно работать вместе.
//        Итог:
// Абстрактная фабрика — это более общий паттерн по сравнению с Фабричным методом.
// Если фабричный метод обычно отвечает за создание одного продукта, то абстрактная фабрика работает
// с группами продуктов, которые могут быть взаимосвязаны и должны использоваться вместе.