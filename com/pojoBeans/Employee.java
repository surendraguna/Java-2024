package com.pojoBeans;

import java.io.Serializable;

public class Employee implements Serializable {
    private int id;
    private String name;
    private int salary;
    Integer i;
    public Employee(){
        
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
