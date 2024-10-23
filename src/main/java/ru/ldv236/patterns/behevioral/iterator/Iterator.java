package ru.ldv236.patterns.behevioral.iterator;

// Интерфейс для итератора
interface Iterator<T> {
    boolean hasNext();  // Проверяет, есть ли следующий элемент
    T next();           // Возвращает следующий элемент
}