package com.exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException, UserDefined {
        File f = new File("./com/exception/sample.txt");
        if(!f.exists())
            f.createNewFile();
        
        // try with resources are used to AutoClosable
        try (
            BufferedReader br = new BufferedReader(new FileReader("./com/exception/sample.txt"))
        ) {
            String line = new String();
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            int[] a = {1, 3};
            System.out.println(a[3]);
            System.out.println(1/0);
            
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        catch (NullPointerException e){
            System.out.println(e);
        } catch (Exception e){
            System.out.println(e);
        } finally{
            System.out.println("Finaly");
        }

        try {
            System.out.println(1/0);
        } catch (ArithmeticException e) {
            System.out.println(new ArithmeticException("Don't do it"));
        }

        try{
            System.out.println(1/0);
        } catch (ArithmeticException e){
            System.out.println(new UserDefined("User Exception"));
            throw new UserDefined("throw user defined");
        }

        try {
            System.out.println(1/0);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("throw is used"); // this stop the flow of excution 
        } finally{
            System.out.println("throw finally");
        }
        

    }

    
}
