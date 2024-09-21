package ru.lessons24.core.Arrays;

import java.util.Arrays;
import java.util.Random;

public class SortArray {
//    Пузырьковая сортировка://
//    Сложность: O(n²).
//    Простой, но медленный алгоритм. Меняет соседние элементы, если они не в порядке.

//    Сортировка выбором://
//    Сложность: O(n²).
//    Ищет минимальный элемент и перемещает его в начало неотсортированной части.

//    Сортировка вставками://
//    Сложность: O(n²) в худшем случае и O(n) в лучшем.
//    Вставляет элементы в отсортированную часть массива, постепенно увеличивая её.

//    Быстрая сортировка://
//    Сложность: O(n log n) в среднем и O(n²) в худшем случае.
//    Рекурсивно делит массив на две части вокруг опорного элемента и сортирует их.

//    Заключение:
//    Эти четыре алгоритма демонстрируют разные подходы к сортировке данных.
//    В зависимости от размера массива, его структуры и требований по производительности,
//    можно выбирать наиболее подходящий алгоритм.

    public static void main(String[] args) {
        int[] source = new int[10_000];
        Random rand = new Random();
        for (int i = 0; i < source.length; i++) {
            source[i] = rand.nextInt(1000);
        }
//        int[] source = {5, 1, 4, 2, 8};
        int[] array;
        long startTime, elapsedTime;

        array = Arrays.copyOf(source, source.length);
            startTime = System.currentTimeMillis();
        bubbleSort(array);
            elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println("Пузырьковая сортировка (" + elapsedTime + ") - " + java.util.Arrays.toString(array));

        array = Arrays.copyOf(source, source.length);
            startTime = System.currentTimeMillis();
        selectionSort(array);
            elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println("Сортировка выбором (" + elapsedTime + ") - " + java.util.Arrays.toString(array));

        array = Arrays.copyOf(source, source.length);
            startTime = System.currentTimeMillis();
        insertionSort(array);
            elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println("Сортировка вставками (" + elapsedTime + ") - " + java.util.Arrays.toString(array));

        array = Arrays.copyOf(source, source.length);
            startTime = System.currentTimeMillis();
        quickSort(array, 0, array.length - 1);
            elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println("Быстрая сортировка (" + elapsedTime + ") - " + java.util.Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
//        1. Пузырьковая сортировка (Bubble Sort)
//        Пузырьковая сортировка проходит по массиву несколько раз, сравнивая соседние элементы
//        и меняя их местами, если они стоят в неправильном порядке.
//        Процесс повторяется, пока массив не станет отсортированным.
        int n = array.length;
        boolean swapped;
        // Проходим по массиву несколько раз
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // Сравниваем соседние элементы и меняем их местами, если нужно
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Меняем местами
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // Если на этом проходе не было обменов, массив отсортирован
            if (!swapped) {
                break;
            }
        }
    }

    public static void selectionSort(int[] array) {
//        2. Сортировка выбором (Selection Sort)
//        Сортировка выбором на каждом шаге находит минимальный элемент
//        из неотсортированной части массива и меняет его местами с первым элементом этой части.
        int n = array.length;

        // Проходим по массиву
        for (int i = 0; i < n - 1; i++) {
            // Предполагаем, что текущий элемент минимален
            int minIndex = i;
            // Находим минимальный элемент в неотсортированной части массива
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Меняем местами минимальный элемент и первый элемент неотсортированной части
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void insertionSort(int[] array) {
//        3. Сортировка вставками (Insertion Sort)
//        Сортировка вставками строит отсортированную часть массива, добавляя каждый новый
//        элемент в правильное место относительно уже отсортированных элементов.
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i]; // Элемент, который нужно вставить в отсортированную часть
            int j = i - 1;

            // Сдвигаем элементы, которые больше ключа, вправо
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            // Вставляем ключ на правильное место
            array[j + 1] = key;
        }
    }

    public static void quickSort(int[] array, int low, int high) {
//        4. Быстрая сортировка (Quick Sort)
//        Быстрая сортировка — это рекурсивный алгоритм, который использует стратегию
//        "разделяй и властвуй". Она выбирает опорный элемент (pivot), а затем делит массив
//        на две части: элементы, меньшие опорного, и элементы, большие опорного.
        if (low < high) {
            // Находим индекс разделения массива
            int partitionIndex = partition(array, low, high);

            // Рекурсивно сортируем левую и правую части
            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high]; // Опорный элемент
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                // Меняем элементы array[i] и array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // Меняем опорный элемент и элемент, который находится на i+1
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
}
