package com.company.prep;

public class CorbaApplication {

    static class CorbaComponent {
        String ior;

        CorbaComponent() {
            startUp("IOR");
        }

        void startUp(String s) {
            ior = s;
        }

        void print() {
            System.out.println(ior);
        }
    }

    static class OrderManager extends CorbaComponent {
        OrderManager() {
        }

        void startUp(String s) {
            ior = getIORFromURL(s);
        }

        String getIORFromURL(String s) {
            return "URL://" + s;
        }
    }

    public static class Application {
        public static void main(String[] args) {
            start(new OrderManager());
        }

        static void start(CorbaComponent cc) {
            cc.print();
        }
    }
}