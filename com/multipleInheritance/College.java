package com.multipleInheritance;

public class College extends Teacher implements NonTeaching {

    public void detailsOfNonTeaching() {
        System.out.println("NonTeaching");
    }

    public static void main(String[] args) {
        new Teacher().detailsOfStudent();
        new Teacher().detailsOfTeacher();
        new College().detailsOfNonTeaching();
    }
    
}
