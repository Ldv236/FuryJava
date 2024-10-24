package ru.ldv236.CollectionsOld.HashMapWithHardcodeHashCode;

import java.util.Objects;

public class KeyForMap {
    private int hardHashCode;
    private String someValue;

    public KeyForMap(int hardHashCode, String someValue) {
        this.hardHashCode = hardHashCode;
        this.someValue = someValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KeyForMap keyForMap = (KeyForMap) o;
        return hardHashCode == keyForMap.hardHashCode && Objects.equals(someValue, keyForMap.someValue);
    }

        @Override
    public int hashCode() {
        return hardHashCode;
    }

    @Override
    public String toString() {
        return "hardHashCode=" + hardHashCode +'}';
    }
}
