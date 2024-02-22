package com.example.bank;

import com.example.bank.Bank.Outer.Inner;

public class Bank {

    class Outer{
        static class Inner{
            static void show(){
                System.out.println("Inner class method");
            }
        }

        void show(){
            System.out.println("Outer class method");
        }
    }
    static int currBalance = 1000;
    public void greetCustomer() {
        System.out.println("Welcome to the bank!");
    }
    
    public void deposit(int amount) {
        currBalance += amount;
    }

    public void withdraw(int amount) {
        currBalance -= amount;
    }

    public void checkBalance() {
        System.out.println("Your current balance is: " + currBalance);
    }

    public static void main(String[] args) {
        new Bank().checkBalance();
        Inner.show();
        new Bank().new Outer().show();

    }
    
}
