package ru.ldv236.OOP.Methods;

public class Car {
    String model;
    String color;
    int year;

    public void start() {
        System.out.println(getInfo() + " - Двигатель заведен");
    }

    //примем параметра - скорости, в мейне добавить просто цифру
    public void ride(int speed) {
        System.out.println(getInfo() + " - Поехали, скорость - " + speed);
    }

    //добавить перегруженый метод без параметра, убрать скорость,
    // сказать про область видимости, вызвать тоже в мейне
    public void ride() {
        System.out.println(getInfo() + " - Поехали");
    }


    // что если много параметров? а что если я не знаю, сколько будет их при каждом вызове?
//    public void ride(int speed, int speed2, int speed3, int speed4) {

    //джавадок добавить после выпадения исключения и падения программы без обработки,
    //типа а как второй программист должен узнать, что отсбъюда может выброситься исключение?
    //сначала жавадок, потом секцию тровс
    /**
     *
     * @param speeds
     * @throws IllegalArgumentException если скорость больше 100 км/ч
     */
    public void ride(int... speeds) throws IllegalArgumentException {
        StringBuilder sb = new StringBuilder();
        for (int value : speeds) {
            sb.append(value).append(" - ");
            //это уже после разбора вараргсов, для демонстрации исключений из методов
            if (value > 100) {
                throw new IllegalArgumentException("Слишком быстро (%d км/ч), получен штраф".formatted(value));
            }
        }
        System.out.println(getInfo() + " - Поехали, скорость - " + sb);
    }


    public void stop() {
        System.out.println(getInfo() + " - Остановка");
    }

    public String getInfo() {
        String info = model + " " + color + " " + year;
        return info;
    }
}
