package ru.ldv236.OOP.abstraction2.interfaces;

public interface Refuelable {
    //при добавление в иерархию этого интерфейса - сначала имплементировать его в Транспорт, НО вдруг выясняется
    // что для велосипеда это неактуально, и там приходится делать заглушку
    // но с заглушкой тоже не оч, поэтому имлементируем не в Транспорт, а в Кар и Трак
    void refuel();
}
