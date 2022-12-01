package com.lesson.first.HW_2_3;

public class Main {
    public static void main(String[] args) {
        StringBuilder resSum = new StringBuilder();
        StringBuilder resDiff = new StringBuilder();
        StringBuilder resMult = new StringBuilder();
        StringBuilder res = new StringBuilder();

        int a = 3;
        int b =56;
        int sum = a+b;
        int diff = a-b;
        int mult = a*b;

        resMult.append(a);
        resMult.append(" * ");
        resMult.append(b);
        resMult.append(" = ");
        resMult.append(mult+" ");


        resSum.append(a);
        resSum.append(" + ");
        resSum.append(b);
        resSum.append(" = ");
        resSum.append(sum+" ");


        resDiff.append(a);
        resDiff.append(" - ");
        resDiff.append(b);
        resDiff.append(" = ");
        resDiff.append(diff+" ");


        res.append(resMult);
        res.append(resDiff);
        res.append(resMult);

        System.out.println(res);
    }
}
