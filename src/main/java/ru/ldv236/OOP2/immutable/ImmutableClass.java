package ru.ldv236.OOP2.immutable;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableClass {
    private final int immutableField;
    private final MutableObject mutableObject;
    private final List<MutableObject> mutableList;

    // Конструктор для инициализации всех полей
    public ImmutableClass(int fieldValue, MutableObject object, List<MutableObject> list) {
        this.immutableField = fieldValue;

        // Создание глубокой копии для изменяемого объекта
        this.mutableObject = new MutableObject(object);

        // Создание глубокой копии для списка изменяемых объектов
        this.mutableList = new ArrayList<>();
        for (MutableObject item : list) {
            this.mutableList.add(new MutableObject(item));
        }
    }

    // Геттеры
    public int getImmutableField() {
        return immutableField;
    }

    public MutableObject getMutableObject() {
        // Возвращаем глубокую копию, чтобы предотвратить изменение извне
        return new MutableObject(mutableObject);
    }

    public List<MutableObject> getMutableList() {
        // Возвращаем глубокую копию списка
        List<MutableObject> copy = new ArrayList<>();
        for (MutableObject item : mutableList) {
            copy.add(new MutableObject(item));
        }
        return copy;
    }
}