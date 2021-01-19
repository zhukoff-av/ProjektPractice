package com.jr;

import java.util.ArrayList;
import java.util.Collections;

public class Lottery {

    public static void main(java.lang.String[] args) {

        ArrayList<Integer> lottery = new ArrayList<>(50);
        for (int i = 1; i <= 35; i++) {

            lottery.add(i);
//добавляем в барабан числа от 1 до 100

        }

        Collections.shuffle(lottery);
//перемешиваем

        System.out.println("Внимание! Из барабана появляются первые 7 чисел!");
        for (int i = 0; i < 7; i++) {

            System.out.println(lottery.get(i));
        }

    }
}
