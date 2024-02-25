package com.functionalInterface;

public class User {
    public static void main(String[] args) {
        // anonymous class
        Car c = new Car() {

            @Override
            public void drive() {
                System.out.println("Car");
            }
            
        };
        c.drive();
    }
}
