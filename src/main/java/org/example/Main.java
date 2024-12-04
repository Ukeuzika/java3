package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        int iterations = 10000;

        ListPerformance performanceTester = new ListPerformance();

        List<Integer> arrayList = new ArrayList<>();
        long arrayListAddTime = performanceTester.testAddPerformance(arrayList, iterations);
        long arrayListGetTime = performanceTester.testGetPerformance(arrayList, iterations);
        long arrayListRemoveTime = performanceTester.testRemovePerformance(arrayList, iterations);

        List<Integer> linkedList = new LinkedList<>();
        long linkedListAddTime = performanceTester.testAddPerformance(linkedList, iterations);
        long linkedListGetTime = performanceTester.testGetPerformance(linkedList, iterations);
        long linkedListRemoveTime = performanceTester.testRemovePerformance(linkedList, iterations);

        System.out.printf("%-15s %-15s %-15s %-15s\n", "Method", "Iterations", "ArrayList Time", "LinkedList Time");
        System.out.printf("%-15s %-15d %-15d %-15d\n", "add", iterations, arrayListAddTime, linkedListAddTime);
        System.out.printf("%-15s %-15d %-15d %-15d\n", "get", iterations, arrayListGetTime, linkedListGetTime);
        System.out.printf("%-15s %-15d %-15d %-15d\n", "remove", iterations, arrayListRemoveTime, linkedListRemoveTime);
    }
}