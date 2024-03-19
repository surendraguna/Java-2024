package com.cursorPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;


public class Practice {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        Integer a[] = {1, 2, 3, 4, 5};
        v.addAll(Arrays.asList(a));
        Enumeration<Integer> e = v.elements();
        while (e.hasMoreElements()) {
            System.out.print(e.nextElement() + " ");
            
        }
        System.out.println();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.addAll(v);
        Iterator<Integer> i = arr.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
            i.remove();
        }
        System.out.println();
        arr.addAll(v);
        ListIterator<Integer> li = arr.listIterator();
        while (li.hasNext()) {
            System.out.print(li.next() + " ");
        }
        System.out.println();
        while (li.hasPrevious()) {
            System.out.print(li.previous() + " ");
        }
        System.out.println();
        li.remove();
        System.out.println(arr);
        li.add(10);
        System.out.println(arr);
    }
}
