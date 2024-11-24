package ru.ldv236.OOP2.immutable;

public  class MutableObject {
    private int data;

    public MutableObject(MutableObject other) {
        this.data = other.data;
    }

    // Дополнительные методы...
}
