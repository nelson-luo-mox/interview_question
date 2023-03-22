package com.interview.question5;

public class Question8 {
    public static void main(String[] args) {
        Base b = new Derived();
        b.foo();
    }
}

class Base {
    public void foo() {
        System.out.println("Base's foo()");
    }
}

class Derived extends Base {
    public void foo() {
        System.out.println("Derived's foo()");
    }
}
