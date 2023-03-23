package com.interview;

import java.util.HashMap;

class NewClass {
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
        NewClass objectOne = new NewClass();
        NewClass objectTwo = new NewClass();

        System.out.println("output:");
        HashMap<NewClass, String> hashMap = new HashMap<>();
        hashMap.put(objectOne, "hello");
        hashMap.put(objectTwo, "world");
        System.out.println(hashMap.size());

    }
}
