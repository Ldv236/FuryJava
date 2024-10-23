package ru.ldv236.patterns.creational.factoryMethod.main;

import ru.ldv236.patterns.creational.factoryMethod.factories.RoadLogistics;
import ru.ldv236.patterns.creational.factoryMethod.factories.SeaLogistics;
import ru.ldv236.patterns.creational.factoryMethod.factories.Transport;

public class Main {
    public static void main(String[] args) {
        // Логистика по дорогам
        Transport roadLogistics = new RoadLogistics();
        roadLogistics.startTransport(); // Вывод: Starting the transport with Truck. Delivering by land in a box.

        System.out.println();

        // Логистика по морю
        Transport seaLogistics = new SeaLogistics();
        seaLogistics.startTransport(); // Вывод: Starting the transport with Ship. Delivering by sea in a container.
    }
}
// Объяснение:
// Фабричный метод createTransport() — это абстрактный метод, который каждая конкретная фабрика
// (в данном случае RoadLogistics и SeaLogistics) должна реализовать.
// В каждой из них этот метод возвращает нужный объект, будь то Truck или Ship.
//
// Метод startTransport() в базовом классе Transport работает с объектом, возвращённым фабричным методом,
// но он не знает, какой именно объект будет создан — это решает подкласс.
// Это даёт гибкость, так как добавление нового типа транспорта не требует изменения базового класса.
//
// Конкретные классы RoadLogistics и SeaLogistics сами решают, какой объект транспорта создавать.
// При этом основной код (клиентский код) работает с абстракциями, не зная о конкретных реализациях.
//
// Когда применять фабричный метод:
// Когда классу нужно делегировать создание объектов своим подклассам.
// Когда необходимо обеспечить создание объектов,
//      следуя принципу "программирование через интерфейсы", не завязываясь на конкретные классы.
// Когда нужно сделать систему расширяемой:
//      добавление новых типов объектов может быть сделано через создание новых подклассов без изменения существующего кода.
// Таким образом, Фабричный метод даёт вам гибкость в создании объектов и позволяет легко расширять систему,
// добавляя новые типы объектов, не меняя основной код приложения.