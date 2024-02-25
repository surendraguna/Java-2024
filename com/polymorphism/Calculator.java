package com.polymorphism;

public class Calculator {
    public static void main(String[] args) {
        // Method Overloading
        add(1, 2);
        add(1, 2, 3);
        
    }
    static void add(int a, int b){
        System.out.println(a + b);
    }

    static void add(int a, int b, int c){
        System.out.println(a + b + c);
    }
}
