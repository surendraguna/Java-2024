package com.threading;


public class Practice {
    public static void main(String[] args) throws InterruptedException {
        // System.out.println(Thread.currentThread());
        // System.out.println(Thread.currentThread().threadId());
        // System.out.println(Thread.currentThread().getName());
        // System.out.println(Thread.currentThread().getPriority());
        // System.out.println(Thread.activeCount());
        // System.out.println(Thread.activeCount() + " " + Thread.currentThread());
        // // creation of new thread
        // Thread t1 = new Thread();
        // t1.start();
        // System.out.println(Thread.activeCount() + " " + t1.getPriority());
        Emp e = new Emp("Surya"); // extends
        e.start();
        e.join();
        new Maneger().start();
        Student s = new Student(); // Implements
        // s.run();
        Thread t0 = new Thread(s);
        t0.start();
        t0.join();
        Runnable r = () -> {
            System.out.println("lambda expression"); 
            System.out.println(Thread.currentThread());
        };
        r.run();
        Thread t1 = new Thread(r, "surya");
        t1.start();
        t1.join();
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Using anonymous class");
                System.out.println(Thread.currentThread());
            }
            
        };
        r1.run();
        Thread t2 = new Thread(r1, "guna");
        System.out.println(t2.getState());
        t2.start();
        System.out.println(t2.getState());
        t2.join();
        System.out.println(t2.getState());

        
    }
}

class Emp extends Thread{
    public Emp(String name){
        super(name);
    }
    @Override
    public void run () {
        //System.out.println(Thread.currentThread());
        add(5, 6);
    }
    private void add(int a, int b){
        System.out.println(a + b + " " + "extends");
    }
}

class Maneger extends Thread{
    @Override
    public void run () {
        //System.out.println(Thread.currentThread());
        add(5, 6);
    }
    private void add(int a, int b){
        System.out.println(a - b  + " " + "extends");
    }
}

class Student implements Runnable{
    @Override
    public void run() {
        System.out.println("Student implements");    
    }
}
