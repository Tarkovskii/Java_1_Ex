package com.lesson.first.FinalWork;

import java.util.Set;

public class Main {

    static Logic myMap = new Logic();

    public static void main(String[] args) {

        myMap.methodAdd(13, 45);

        Set<Integer> revMyMap = myMap.returnSet();


        System.out.println(myMap.methodRead());
        System.out.println(revMyMap);
    }
}


