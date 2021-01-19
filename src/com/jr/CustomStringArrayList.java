package com.jr;

public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    public void grow() {
        int newCapacity = (int) (size * 2.5);
        elements = new String[newCapacity];
    }

    public static void main(String[] args) {
        CustomStringArrayList arrayList = new CustomStringArrayList();
        for (int i = 0; i < 25; i++) {
            arrayList.add("count" + i);
        }
    }
}
