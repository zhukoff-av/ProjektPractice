package com.jr;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListVsArrayList {
    /**
     * Время добавления в Linked List: 276 ms
     */
    void testAddingElementsInCenterLinkedList() {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 5_000_000; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 1_000_000; i < 2_000_000; i++) {
            list.add(i);
        }
        System.out.println("Время добавления в Linked List: " + (System.currentTimeMillis() - start) + " ms");
    }

    /**
     * Время добавления в Array List: 106 ms
     */
    void testAddingElementsInCenterArrayList() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5_000_000_0; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 1_00; i < 4_000_000; i++) {
            list.add(i);
        }
        System.out.println("Время добавления в Array List: " + (System.currentTimeMillis() - start) + " ms");
    }

    public static void main(String[] args) {
        LinkedListVsArrayList ll = new LinkedListVsArrayList();
        ll.testAddingElementsInCenterArrayList();
    }
}
