package com.pojoBeans;

import java.util.ArrayList;

public class EmpSal {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        e1.setId(101);
        e1.setName("Surendra");
        e1.setSalary(1001);
        e2.setId(102);
        e2.setName("Surendra1");
        e2.setSalary(10001);
        e3.setId(103);
        e3.setName("Surendra2");
        e3.setSalary(10001);
        
        ArrayList<Employee> e = new ArrayList<Employee>();
        e.add(e1);
        e.add(e2);
        e.add(e3);
        int sum = 0;
        for(Employee emp : e){
            System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getSalary());
            sum += emp.getSalary();
        }
        System.out.println(sum);
    }
}
