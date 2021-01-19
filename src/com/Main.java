package com;

public class Main {

    public static class Singleton {
        public static Singleton instance;

        private Singleton() {
        }

        public static Singleton singleton() {

            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
    }

    public enum Sgltn {
        INSTANCE;
    }

    public static void main(String[] args) {
        System.out.println(Sgltn.INSTANCE);
    }

}
