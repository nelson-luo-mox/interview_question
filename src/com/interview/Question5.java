package com.interview;

import java.math.BigDecimal;

public class Question5 {
    public static void main(String[] args) {
        BigDecimal first = new BigDecimal(0.01);
        BigDecimal second = BigDecimal.valueOf(0.01);
        BigDecimal third = new BigDecimal("0.01");

        System.out.println("output 1:");
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        System.out.println("output 2:");
        System.out.println(first == second);
        System.out.println(first == third);
        System.out.println(second == third);

//
//        System.out.println("output 3:");
//        BigDecimal oneDividedByTwo = BigDecimal.ONE.divide(BigDecimal.valueOf(2));
//        System.out.println(oneDividedByTwo);
//
//        BigDecimal oneDividedByThree = BigDecimal.ONE.divide(BigDecimal.valueOf(3));
//        System.out.println(oneDividedByThree);
    }
}
