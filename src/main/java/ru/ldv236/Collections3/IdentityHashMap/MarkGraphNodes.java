package ru.ldv236.Collections3.IdentityHashMap;

import java.util.IdentityHashMap;
import java.util.Map;

public class MarkGraphNodes {
    public static void main(String[] args) {
        // Пример 2: Отслеживание посещенных объектов при обходе графа
        Map<Node, Boolean> visited = new IdentityHashMap<>();
        Node node1 = new Node("A");
        Node node2 = new Node("A");

        // Пометим первый узел как посещенный
        visited.put(node1, true);

        // node1 и node2 имеют одинаковые значения, но это разные объекты
        System.out.println("Node1 посещен: " + visited.containsKey(node1)); // true
        System.out.println("Node2 посещен: " + visited.containsKey(node2)); // false
    }

    private static class Node {
        String value;
        Node(String value) {
            this.value = value;
        }
    }
}
