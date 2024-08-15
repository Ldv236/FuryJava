package ru.LeetCode.LruCacheOnLinkedHashMap;

public class Main {

    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache<>(3);

        cache.put(1, "A");
        cache.put(2, "B");
        cache.put(3, "C");

        System.out.println(cache); // Вывод: {1=A, 2=B, 3=C}

        cache.get(1);  // Доступ к ключу 1, теперь он считается последним использованным
        cache.put(4, "D");  // Вставляем новый элемент

        System.out.println(cache); // Вывод: {2=B, 3=C, 1=A} -> {3=C, 1=A, 4=D}
    }
}
