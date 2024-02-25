package com.exception;

public class Division {
    public static void main(String[] args) throws Exception, ArithmeticException {
        try {
            System.out.println(5/0);
        }
        catch(Exception e){
            System.out.println(e.toString());
            throw e;
        }
        finally{
            System.out.println("sut");
        }
        System.out.println("Hello");
        
    }

    
}
