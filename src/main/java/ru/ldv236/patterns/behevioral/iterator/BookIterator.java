package ru.ldv236.patterns.behevioral.iterator;

// Конкретный итератор для коллекции книг
class BookIterator implements Iterator<Book> {
    private BookCollection collection;
    private int currentIndex = 0;

    public BookIterator(BookCollection collection) {
        this.collection = collection;
    }

    // Проверяем, есть ли еще книги
    @Override
    public boolean hasNext() {
        return currentIndex < collection.getBooks().length && collection.getBooks()[currentIndex] != null;
    }

    // Возвращаем следующую книгу
    @Override
    public Book next() {
        return collection.getBooks()[currentIndex++];
    }
}