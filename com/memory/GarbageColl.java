package com.memory;

public class GarbageColl {
    public void finalize(){
        System.out.println("Finalized is called");
    }
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // unused object
        // un-refference object
        // anonymous object
        GarbageColl g1 = new GarbageColl();
        g1 = null; // unused
        new GarbageColl(); // annonymous object
        GarbageColl g2 = new GarbageColl();
        GarbageColl g3 = new GarbageColl();
        g2 = g3; // unrefference object g2 loss it's previos refference
        System.gc();
    }
}
