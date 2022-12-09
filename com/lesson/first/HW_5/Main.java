package com.lesson.first.HW_5;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> a = new HashMap<>();
        Map<Integer,String> b = new TreeMap<>();

        a.put(1, "Red");
        a.put(2, "Green");
        a.put(3, "Yellow");

        for (Map.Entry<Integer, String> m : a.entrySet()) {
            a.compute(m.getKey(), (k,v) -> v = v+"!");
        }

        System.out.println(a);


        b.put(0,"Blue");
        b.put(1,"Black");
        b.put(2,"Brown");

        for(Map.Entry<Integer,String> l: b.entrySet()){
            b.compute(l.getKey(), (k,v) -> v = v+"!");
        }

        System.out.println(b);


    }
}
