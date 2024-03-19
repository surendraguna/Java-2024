package com.encapsulationPractice;

public class Student {
    private int id;
    private boolean attend;
    
    Student (){

    }    

    Student(int id){
        this.id = id;
        attend = true;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean getAttend() {
        return attend;
    }

    public void setAttend(boolean attend) {
        this.attend = attend;
    }
}
