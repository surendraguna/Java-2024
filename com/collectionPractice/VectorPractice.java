package com.collectionPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class VectorPractice {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        System.out.println(v.size() + " " + v.capacity());
        v.add(null);
        v.addLast(3);
        v.addFirst(2);
        v.add(0, 1);
        System.out.println(v +  " " + v.size() + " " + v.capacity());
        ArrayList<Integer> a = new ArrayList<>();
        a.add(11);
        a.add(12);
        a.add(13);
        a.addAll(Arrays.asList(14, 15, 16, 17));
        v.addAll(1, a);
        System.out.println(v);
        for(Integer vec : v){
            System.out.print(vec + " ");
        }
        System.out.println();
        for(int i = 0; i < v.size(); i++){
            System.out.print(v.get(i) + " ");
        }
        System.out.println();
        v.removeAll(a);
        System.out.println(v);
        System.out.println(v.containsAll(a));
        v.set(1, 69);
        System.out.println(v);
        v.clear();
        System.out.println(v);
        
    }
}
