package com.fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileWrite {
    public static void main(String[] args) throws IOException {
        File file = new File("./com/fileHandling/sample.txt");
        if(!file.exists())
            file.createNewFile();
        FileOutputStream fout = new FileOutputStream(file, true); // Second parameter is used to append data
        String s = "Surnedra1";
        for(int i = 0; i < s.length(); i++){
            fout.write(s.charAt(i));
        }
        fout.flush();
        fout.close();

        FileWriter fw = new FileWriter(file, true);
        s = "\nSurnedra2";
        for(int i = 0; i < s.length(); i++){
            fw.write(s.charAt(i));
        }
        fw.write(s.toCharArray());
        fw.flush();
        fw.close();

        
        BufferedReader br = new BufferedReader(new FileReader(file));
        String old = new String();
        String line = new String();
        while ((line = br.readLine()) != null) {
            old += line + "\n"; 
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        String latest = "hello world";
        bw.write(old + latest);
        br.close();
        bw.close();
    }
}
