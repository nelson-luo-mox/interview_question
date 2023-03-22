package com.interview;

import java.util.HashMap;

public class Question2 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "hello");
        System.out.println(map);

        map.put("b", null);
        System.out.println(map);

        map.put(null, "c");
        System.out.println(map);

        System.out.println(map.size());
    }
}
