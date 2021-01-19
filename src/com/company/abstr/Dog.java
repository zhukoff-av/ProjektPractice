package com.company.abstr;

public class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("dog is eating... ");
    }

    @Override
    public void sound() {
        System.out.println("... dog's sound ... ");
    }
}
