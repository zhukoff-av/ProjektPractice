package com.company;

public class Main {

    static class Baap {
        public int h = 4;

        public int geth() {
            System.out.println("Baap " + h);
            return h;
        }
    }

    public static class Beta extends Baap {
        public int h = 44;

        public int getH() {
            System.out.println("Beta " + h);
            return h;
        }
    }

    public static void main(String[] args) {
        Baap b = new Beta();
        System.out.println(b.h + " " + b.geth());
        Beta bb = (Beta) b;
        System.out.println(bb.h + " " + bb.getH());
    }
}
