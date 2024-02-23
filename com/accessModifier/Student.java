package com.accessModifier;

public class Student {
    private static int i = 4;
    protected static int j = 5;
    static int k = 6;
    public static void main(String[] args) {
       System.out.println(i + " " + j + " " + k);
    }

    public static void print(){
        System.out.println("Student");
    }
}
