package com.interview.question7;

public class Question7 {
    public static void main(String[] args) {
        Base b = new Derived();
        b.foo();
    }
}

class Base {
    public static void foo() {
        System.out.println("Base's foo()");
    }
}

class Derived extends Base {
    public static void foo() {
        System.out.println("Derived's foo()");
    }
}
