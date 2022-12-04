package com.lesson.first.HW_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> callorList = new ArrayList<>();
        callorList.add("red");
        callorList.add("green");
        callorList.add("black");
        callorList.add("blue");
        callorList.add("gray");
        System.out.println(callorList);

        System.out.println("----------------------------");

        for (int i = 0; i < callorList.size(); i++) {
            String a = callorList.get(i);
            StringBuilder sb = new StringBuilder("!");
            String newValues = sb.append(a).toString();
            callorList.set(i, newValues);
        }
        System.out.println(callorList);
        System.out.println("----------------------------");

        callorList.add(0,"orange");
        System.out.println(callorList);
        System.out.println("----------------------------");

        System.out.println(callorList.get(3));
        callorList.set(3, "block");
        System.out.println(callorList);
        System.out.println("----------------------------");

        callorList.remove(3);
        System.out.println(callorList);
        System.out.println("----------------------------");

        for (String x :callorList) {
            if (x.equals("!green")) {
                System.out.println(x);
            }
        }
        System.out.println("----------------------------");

        List newCallor = callorList.subList(0,callorList.size()-2);
        System.out.println(newCallor);
        System.out.println("----------------------------");

        callorList.removeAll(newCallor);
        System.out.println(callorList);
    }
}
