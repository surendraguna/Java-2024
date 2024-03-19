package com.collectionPractice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetPractice {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(5);
        hs.add(5);
        hs.add(6);
        hs.add(1);
        hs.add(4);
        System.out.println(hs);
        System.out.println(hs.remove(7));
        System.out.println(hs.contains(6));
        hs.add(null);
        for(Integer h : hs){
            System.out.print(h + " ");
        }
        System.out.println();
        hs.clear();
        System.out.println(hs);
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(1);
        lhs.add(2);
        lhs.add(4);
        lhs.add(3);
        lhs.add(null);
        lhs.add(null);
        System.out.println(lhs);
        
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(3);
        ts.add(4);
        System.out.println(ts + " " + ts.size());
    }   
}
