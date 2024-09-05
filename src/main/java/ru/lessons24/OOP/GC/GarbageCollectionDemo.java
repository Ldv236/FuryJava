package ru.lessons24.OOP.GC;

public class GarbageCollectionDemo {

    // Конструктор
    public GarbageCollectionDemo(int id) {
        this.id = id;
        System.out.println("Object " + id + " created.");
    }

    private int id;

    // Переопределяем finalize() для демонстрации удаления объектов
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object " + id + " is being garbage collected.");
    }
}
