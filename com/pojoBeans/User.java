package com.pojoBeans;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Student s = new Student();
        s.setId(101);
        s.setName("Surnedra");
        System.out.println(s.getId() + " " + s.getName());
        Student a[] = new Student[2];
        for(int i = 0; i < a.length; i++){
            a[i] = new Student();
            a[i].setId(inp.nextInt());
            inp.nextLine();
            a[i].setName(inp.nextLine());
        }
        for (Student student : a) {
            System.out.println(student.getId() +" " +  student.getName());
        }
        inp.close();
    }

}
