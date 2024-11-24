package ru.ldv236.Collections2.MapImplementations.HashMapWithHardcodeHashCode;

import java.util.Objects;

public class Person {
    private int index;

    public Person(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "P{" + index + "}";
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
