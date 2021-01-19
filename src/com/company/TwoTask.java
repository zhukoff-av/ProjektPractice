package com.company;

public class TwoTask {

    static class A {
        public void mA() {
            System.out.println("Class A, method mA");
        }
    }

    static class B extends A {
        public void mA() {
            System.out.println("Class B, method mA");
        }

        public void mB() {
            System.out.println("Class B, method mB");
        }
    }

    static class C extends B {
        public void mC() {
            System.out.println("Class C, method mC");
        }
    }

    public static void main(String[] args) {
        A x = new B();
        B y = new B();
        B z = new C();
    }
}
