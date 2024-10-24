package ru.ldv236.OOP.HierarchyTransportService.var1bad;

public class Truck extends Car implements TruckService {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем грузовую покрышку");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

/*
    наставнику!
    прошу подсказать, какой способ предпочтительнее
    (м.б. в плане архитектуры или каких-то подводных камней при дальнейшем масштабировании):
    1. Как сделано сейчас - наследование "по цепочке" от Car и реализация интерфейса для грузовиков
    2. Наследование от начального Vehicle и реализация обоих интерфейсов - для моторных ТС и для грузовиков
*/
}
