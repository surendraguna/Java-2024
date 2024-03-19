package com.threading;

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Dairy log = new Dairy();
        Runnable r1 = () -> {
            int c = 0;
            for (int i = 0; i < 100; i++){
                c++;
                if(c == 50){
                    log.increCount();
                    c = 0;
                }
            }
        };
        Runnable r2 = () -> {
            for (int i = 0; i < 200; i += 50){
                log.increCount();
            }
        };
    
        Runnable r3 = () -> {
            for (int i = 0; i < 500; i += 50){
                log.increCount();
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
        System.out.println(log.getCount());
    }
}

class Dairy{
    private volatile int count = 0;
    public int getCount() {
        return count;
    }
    public /*synchronized*/ void increCount(){
        // count += 50;
        synchronized (this){
            count += 50;
        }
    }
}
