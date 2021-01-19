package com.jr;

import java.util.*;

public class CollectionIterator {

    /**
     * 1. Iterable.forEach(Consumer<? super T> action)
     */
    void iterableForEach() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        numbers.forEach(s -> System.out.print(s + " "));
    }

    /**
     * 2. Collection.removeIf(Predicate<? super E> filter)
     */
    void collectionRemoveIf() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        numbers.removeIf(s -> s > 5);
        numbers.forEach(s -> System.out.print(s + " "));
    }

    /**
     * 3. Map.forEach(BiConsumer<? super K, ? super V> action)
     */
    void mapForEach() {
        Map<String, String> books = new HashMap<>();
        books.put("Audi", "Ingolstadt");
        books.put("BMW", "München");
        books.put("Porsche", "Stuttgart");
        books.put("VW", "Wolfsburg");
        books.forEach((a, b) -> System.out.println("Auto: " + a + ". Stadt: " + b));
    }

    /**
     * 4. Map.compute(K key,BiFunction<? super K, ? super V, ? extends V> remappingFunction)
     */
    void mapCompute(){

    }



    public static void main(String[] args) {
        CollectionIterator ci = new CollectionIterator();
        ci.mapForEach();
    }
}
