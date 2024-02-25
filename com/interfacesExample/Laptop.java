package com.interfacesExample;

public interface Laptop {
    public void processor();
    public void display();
    public void camera();
    default void security() {
        comment();
        System.out.println("Security");
    }

    static void audio(){
        comment();
        System.out.println("Laptop audio");
    }

    private static void comment(){
        System.out.println("comment");
    }
}
