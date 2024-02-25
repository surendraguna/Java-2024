package com.fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TextFileRead {
    public static void main(String[] args) throws Throwable {
        File f = new File("./com/fileHandling/sample.txt");
        if(!f.exists())
            f.createNewFile();
        // File Input Stream
        System.out.println("File Input Stream");
        FileInputStream file = new FileInputStream(f);
        int ascii;
        String s = new String();
        while ((ascii = file.read()) != -1) {
            System.out.print((char)ascii);
            s += String.valueOf((char)ascii);
        }
        System.out.println();
        System.out.println(s);        
        // Scanner class
        System.out.println("Scanner class");
        Scanner scan = new Scanner(f);
        // Scanner sca = new Scanner(new FileInputStream(f));
        s = new String();
        while (true) {
            // System.out.print(scan.next());
            s += scan.nextLine();
            if(!scan.hasNextLine())
                break;
            else   
                s += "\n";
            
        }
        System.out.println(s);
        scan.close();
        file.close();

        // file reader
        System.out.println("file reader");
        FileReader fr = new FileReader(f);
        s = new String();
        while ((ascii = fr.read()) != -1) {
            System.out.print((char)ascii);
            s += String.valueOf((char)ascii);
        }
        System.out.println();

        System.out.println(s);
        fr.close();

        // Buffer Reader

        System.out.println("Buffer Reader");
        FileReader fil = new FileReader(f);
        BufferedReader br = new BufferedReader(fil);
        String line =  new String();
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
        fr.close();
        try (
            FileInputStream fi = new FileInputStream(f);
            InputStreamReader inp = new InputStreamReader(fi);
            BufferedReader b = new BufferedReader(inp);
        ) {
            line = new String();
            while ((line = b.readLine()) != null) {
                System.out.println(line);
            } 
        }    
    }
    
}
