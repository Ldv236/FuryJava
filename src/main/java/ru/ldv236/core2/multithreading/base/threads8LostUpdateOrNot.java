package ru.ldv236.core2.multithreading.base;

public class threads8LostUpdateOrNot {
    private int value;

//    Допустим один поток выполнил updateValue(5), а другой updateValue(10)
//    Считается ли, что второй поток затёр изменения первого?
//    На самом деле нет. Несколько микросекунд значение value было равно 5,
//    это изменение никуда не пропало. Потом другой поток изменил значение на десятку.
//    Система живёт и меняет своё состояние. Это норма
    public void updateValueNotLostUpdate(int value) {
        this.value = value;
    }

//    Если бы метод updateValue рассчитывал значение более сложно, например, так:
//    То в таком коде потерянный апдейт становится возможным:
//  Исходное значение value = 0
//  Поток Т1 делает updateValue(5)
//  Поток Т2 делает updateValue(10)
//  Что вернёт getValue()? Ожидаем, что 15, но при неудачном стечении обстоятельств можем получить 5 или 10.
    public void updateValueMaybeLostUpdate(int value) {
        this.value += value;
    }

    public int getValue() {
        return value;
    }
}
