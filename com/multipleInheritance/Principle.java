package com.multipleInheritance;

public class Principle extends College{
    public static void main(String[] args) {
        new College().detailsOfStudent();
        new College().detailsOfTeacher();
        new College().detailsOfNonTeaching();
    }

}
