package com.company;

public class Three {

static class X {
    public X() {
        System.out.println("in X");
    }
}

static class Y extends X {
    public Y() {
        super();
        System.out.println("In Y");
    }
}

static class Z extends Y {
    public Z(){
        System.out.println("In Z");
    }}


    public static void main(String[] args) {
        Y y = new Z();
    }
}
