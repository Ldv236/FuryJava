package ru.tasks.LruCacheOnLinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    // Устанавливаем начальную емкость так, чтобы избежать расширения
    // capacity / 0.75f округляется до ближайшего целого значения
    public LRUCache(int capacity) {
        super((int) Math.ceil(capacity / 0.75f) + 1, 0.75f, true);
        // true означает, что используется accessOrder
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity; // Удаляем старейший элемент, если размер превышает лимит
    }
}
