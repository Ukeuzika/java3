package org.example;

import java.util.List;

/**
 * Класс для тестирования производительности операций с различными реализациями списка.
 */
public class ListPerformance {

    /**
     * Измеряет время, необходимое для добавления элементов в список.
     *
     * @param list      список, в который будут добавляться элементы
     * @param iterations количество элементов для добавления
     * @return время в микросекундах, затраченное на добавление элементов
     */
    public long testAddPerformance(List<Integer> list, int iterations) {
        long startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            list.add(i);
        }
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000; // Время в микросекундах
    }

    /**
     * Измеряет время, необходимое для получения элементов из списка.
     *
     * @param list      список, из которого будут извлекаться элементы
     * @param iterations количество элементов для получения
     * @return время в микросекундах, затраченное на получение элементов
     */
    public long testGetPerformance(List<Integer> list, int iterations) {
        if (list.isEmpty()) {
            for (int i = 0; i < iterations; i++) {
                list.add(i);
            }
        }
        long startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            list.get(i);
        }
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000; // Время в микросекундах
    }

    /**
     * Измеряет время, необходимое для удаления элементов из списка.
     *
     * @param list      список, из которого будут удаляться элементы
     * @param iterations количество элементов для удаления
     * @return время в микросекундах, затраченное на удаление элементов
     */
    public long testRemovePerformance(List<Integer> list, int iterations) {
        if (list.isEmpty()) {
            for (int i = 0; i < iterations; i++) {
                list.add(i);
            }
        }
        long startTime = System.nanoTime();
        if (iterations > 0) {
            list.subList(0, iterations).clear();
        }
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000; // Время в микросекундах
    }
}
