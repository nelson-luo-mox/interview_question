package com.interview;

public class Question4 {
    public static void main(String[] args) {
        System.out.println("output 1:");
        Integer ten = Integer.parseInt("10");
        System.out.println(ten == Integer.valueOf(10));

        System.out.println("output 2:");
        Integer thousand = Integer.parseInt("1000");
        System.out.println(thousand == Integer.valueOf(1000));
    }
}
