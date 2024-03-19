package com.memory;

public class MemoryMangement {
    int i = 0;
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(10);
        System.out.println(new MemoryMangement().i);
        new MemoryMangement().add(0);

        //java.lang.OutOfMemoryError: Java heap space

        int size = 10;
        for (int i = 0; i < Integer.MAX_VALUE; i++){
            int[] a = new int[size];
            size *= 2;
            a = new int[]{1, 2, 3};
            System.out.println(size + a.length);
        }
    }

    // stackoverflow
    void add(int i){
        System.out.println(i++);
        add(i);
    }
}
