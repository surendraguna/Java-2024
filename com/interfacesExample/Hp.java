package com.interfacesExample;

public class Hp extends Guest{
    

    public void security(){
        System.out.println("Hp security");
    }

    public void camera() {
        System.out.println("Camera");
    }

    @Override
    public void master() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'master'");
    }
}
