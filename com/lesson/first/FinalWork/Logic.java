package com.lesson.first.FinalWork;


import java.util.*;

public class Logic {
    Map<Integer, String> myMap = new TreeMap<>();


    public void methodAdd(int size, int max) {
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            myMap.put(rnd.nextInt(0, max), "6");
        }
    }


    public TreeSet<Integer> returnSet() {
        Comparator<Integer> revTreeSet = Comparator.reverseOrder();
        TreeSet<Integer> intSet = new TreeSet<>(revTreeSet);
        for (int a : myMap.keySet()) {
            intSet.add(a);
        }
        return intSet;
    }


    public String methodRead() {
        return myMap.keySet().toString();
    }


}


