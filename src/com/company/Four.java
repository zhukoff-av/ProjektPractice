package com.company;

public class Four {


    static class Data {
        int intVal = 0;
        String strVal = "default";

        Data(int k) {
            this.intVal = k;
        }
    }

    public static void main(String[] args) {
        Data d1 = new Data(5);
        d1.strVal = "D1";

        Data d2 = new Data(10);
        d2.intVal = 20;

        System.out.println("d2 = " + d2.strVal);
    }
}
