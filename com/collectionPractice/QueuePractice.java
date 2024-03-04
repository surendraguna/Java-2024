package com.collectionPractice;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePractice {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>(Comparator.reverseOrder());
        p.offer(3);
        p.offer(2);
        p.offer(1);
        p.offer(5);
        p.offer(4);
        System.out.println(p);
        for (Integer i : p) {
            System.out.print(i + " ");
        }
        System.out.println();
        while (!p.isEmpty()) {
            System.out.print(p.poll() + " ");
        }
        System.out.println();
        Queue<Integer> a = new LinkedList<>();
        a.offer(2);
        a.offer(1);
        System.out.println(a);
        ArrayDeque<String> ad = new ArrayDeque<>();
        ad.offer("surya");
        ad.offerFirst("Banana");
        ad.offer("Surendra");
        ad.offerFirst("apple");
        System.out.println(ad);
        System.out.println(ad.peek());
        
    }
}
