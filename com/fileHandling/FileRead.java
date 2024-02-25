package com.fileHandling;

import java.io.File;
import java.sql.Date;
import java.util.Arrays;

public class FileRead {
    public static void main(String[] args) throws Throwable {
        File file = new File("./com/fileHandling/sample.txt");
        if(!file.exists())
            System.out.println(file.createNewFile());
        System.out.println(file.isHidden());
        System.out.println(file.canWrite());
        file.setReadOnly();
        File dir = new File("./com/fileHandling/english/telugu");
        dir.mkdirs();
        dir.delete();
        System.out.println(dir.exists());
        File f = new File("./");
        for (String string : f.list()) {
            System.out.println(string);
        }
        System.out.println(Arrays.toString(f.listFiles()));
        System.out.println(file.getName() + " " + file.getAbsolutePath() + " " + file.getParent() + " " + file.getPath());
        System.out.println(new Date(file.lastModified()));
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
    }
}
