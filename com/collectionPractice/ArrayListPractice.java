package com.collectionPractice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        System.out.println(a.size() + " " );
        a.add(5);
        for(int i = 0; i < 10; i++)
            a.add(i);
        a.set(5, null);
        Collections.synchronizedCollection(a);
        System.out.println(a);
    }
    
}
