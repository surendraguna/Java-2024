package com.encapsulationPractice;

class Teacher{
    public static void main(String[] args) {
        Student i = new Student();
        System.out.println(i.getId());
        Student s = new Student(101);
        s.setAttend(false);
        System.out.println(s.getId());
        System.out.println(s.getAttend());

    }
    
}