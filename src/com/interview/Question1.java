package com.interview;

import java.util.HashMap;

class BadClass {
    @Override
    public int hashCode() {
        return 123;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}

public class Question1 {
    public static void main(String[] args) {
        BadClass a = new BadClass();
        BadClass b = new BadClass();

        System.out.println("output 1:");
        System.out.println(a.equals(b));

        System.out.println("output 2:");
        System.out.println(a == b);

        System.out.println("output 3:");
        HashMap<BadClass, String> hashMap = new HashMap<>();
        hashMap.put(a, "hello");
        hashMap.put(b, "world");
        System.out.println(hashMap.size());

    }
}
