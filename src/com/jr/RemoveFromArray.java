package com.jr;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveFromArray {

    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {
//
//        for (int i = 0; i < programmingLanguages.size(); i++) {
//            if (programmingLanguages.get(i) != "Java") {
//                programmingLanguages.remove(i);
//            }
//        }
//        System.out.println(programmingLanguages);
        programmingLanguages.removeIf(s -> !s.equals("Java"));

        System.out.println(programmingLanguages);
    }
}
