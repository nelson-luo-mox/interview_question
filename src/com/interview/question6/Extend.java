package com.interview.question6;

public class Extend {
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


// due to the fact that static methods in Java are resolved at compile time based on the declared type of the variable, rather than the runtime type of the object.