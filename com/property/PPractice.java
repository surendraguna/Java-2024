package com.property;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class PPractice {
    public static void main(String[] args) throws IOException {
        File file = new File("./com/property/sample.properties");
        if(!file.exists())  
            file.createNewFile();
        Properties prop = new Properties();
        prop.setProperty("Url", "Localhost");
        prop.setProperty("Username", "Surnedra");
        prop.setProperty("Password", "Svec@1234");
        FileOutputStream fos = new FileOutputStream(file);
        prop.store(fos, "null");
        Set<String> keys = prop.stringPropertyNames();
        System.out.println(keys);
        System.out.println(prop.getProperty("Url"));
        System.out.println(prop.getProperty("Mobi", "Realme"));
        Set<Object> key = prop.keySet();
        Collection<Object> c = prop.values();
        System.out.println(key + " " + c);
        for (Object s : key) {
            System.out.println(s + " " + prop.getProperty((String) s));
        }
    }
}
