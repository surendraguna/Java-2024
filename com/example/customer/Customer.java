package com.example.customer;

import com.example.bank.*;
import com.example.packageexample.*;

/**
 * Customer
 */
public class Customer {

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.greetCustomer();
        bank.deposit(100);
        bank.checkBalance();
        bank.withdraw(50);
        bank.checkBalance();
        Pack.main(args);;
    }
}