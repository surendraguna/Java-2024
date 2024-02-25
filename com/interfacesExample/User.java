package com.interfacesExample;

public class User {
    public static void main(String[] args) {
        Hp h = new Hp();
        h.display();

        Lenovo l = new Lenovo();
        l.display();
        h.security();
    }
}
