package com.interfacesExample;

public abstract class Guest implements Laptop{
    public void processor() {
        System.out.println("Intel 5");
    }

    public void display() {
        System.out.println("16 : 9");
    }

    public abstract void camera();

    public abstract void master();
}   
