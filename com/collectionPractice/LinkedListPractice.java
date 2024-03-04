package com.collectionPractice;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        Integer a[] = {1, 2, 3 ,4 , 5};
        l.addAll(Arrays.asList(a));
        System.out.println(l);
        System.out.println(l.isEmpty());
        l.add(0, null);
        l.addFirst(5);
        l.addLast(6);
        System.out.println(l.element());
        System.out.println(l);
        l.offer(5);
        System.out.println(l);
        System.out.println(l.poll());
        l.pop();
        System.out.println(l);
        for(int i = l.size() - 1; i >= 0; i--){
            System.out.print(l.get(i) + " ");
        }
        System.out.println();
        System.out.println(Math.PI);
    }
}
