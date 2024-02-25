package com.inheritance;

public class Admin extends Dev {
    public void manage(){
        super.read();
        System.out.println("Admin Manage Mode");
    }
    public void read(){
        System.out.println("Admin read");
    }
}