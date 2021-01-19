
package com.company.abstr;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("cat is eating...");
    }

    @Override
    public void sound() {
        System.out.println(" ... cat's sound ... ");
    }
}
