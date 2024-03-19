package com.collectionPractice;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;
import java.util.Map.Entry;



public class MapPractice {
    public static void main(String[] args) {
        Hashtable<Integer, String> h = new Hashtable<>();
        h.put(1, "Surendra");
        h.put(3, "Surendra1");
        h.put(2, "Surendra2");
        h.put(2, "hello");
        Set<Integer> keys = h.keySet();
        for (Integer i : keys) {
            System.out.print(i + " ");
        } 
        System.out.println();
        Collection<String> values = h.values();
        for (String str : values) {
            System.out.print(str + " ");
        }
        System.out.println();
        for (Integer i : keys) {
            System.out.println(i + " " + h.get(i));   
        }
        System.out.println(h);
        h.remove(3);
        System.out.println(h);
        // Verification
        System.out.println(h.contains("Surendra") +  " " + h.containsKey(1) + " " + h.containsValue("null"));
        // Updation
        h.putIfAbsent(1, "null");
        System.out.println(h + " " + h.size());

        Set<Entry<Integer, String>> entries = h.entrySet();
        for(Entry<Integer, String> entry : entries){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        h.put(3, "Surendra");
        System.out.println(h);
    }
}
