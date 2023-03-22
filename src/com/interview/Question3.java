package com.interview;

public class Question3 {
    public static void main(String[] args) {
        try {
            System.out.println(1.0 / 0.0);
        } catch (Exception e) {
            System.out.println("catch exception 1.0 / 0.0");
        }

        try {
            System.out.println(1 / 0);
        } catch (Exception e) {
            System.out.println("catch exception 1 / 0");
        }

        // bonus question
        try {
            throw new StackOverflowError();
        } catch (Exception e) {
            System.out.println("catch StackOverflowError");
        }
    }
}
