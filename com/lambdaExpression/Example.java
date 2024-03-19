package com.lambdaExpression;

public class Example {
    public static void main(String[] args) {
        Car c1 = new Car() {
            @Override
            public void drive() {
                System.out.println("BMW");
            }
            
        };
        c1.drive();
        new Audi().drive();
        // Lambda expression with anonymous function
        Car c2 = () -> {
            System.out.println("TATA");
        };
        c2.drive();

        Laptop l = dis -> {
            System.out.println(dis);
        };

        l.show(5);

        Mobi m = (first, second) -> {
            System.out.println(first + " " + second);
        };
        m.display("Surendra", 10);

        CarExample ce = () -> 100;
        System.out.println(ce.speed());
    }
}


@FunctionalInterface
interface Car {
    void drive();    
}

class Audi implements Car{
    @Override
    public void drive() {
        System.out.println("Audi drive");    
    }

}

@FunctionalInterface
interface Laptop {
    void show(int s);
}

@FunctionalInterface
interface Mobi{
    void display(String s, int n);
}

@FunctionalInterface
interface CarExample{
    int speed();
}