package com.company.prep;

public class TestClass {

    static TestClass ref;
    String[] arguments;

    public static void main(String[] args) {
        ref = new TestClass();
        ref.func(args);
    }

    public void func(String[] args) {
        ref.arguments = args;
    }

class OuterB{

}

    class Outer {


        class Inner extends OuterB{
            static final int k = 10;
        }
    }
}
