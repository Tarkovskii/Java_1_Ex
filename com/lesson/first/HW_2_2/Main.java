package com.lesson.first.HW_2_2;

public class Main {
    public static void main(String[] args) {


        String origString = "Grebanya";
        String checkString = "banyaGre";
        CheckTrue(origString, checkString);
    }

    static void CheckTrue(String original, String check) {
        if (original.length() != check.length()) {
            System.out.println("Impossible found");
            ;
        } else {
            for (int i = 0; i < original.length(); i++) {
                String checking = check.substring(i) + check.substring(0, i);
                if (checking.equals(original)) {
                    System.out.println("Found");
                    break;
                }
            }
        }
    }
}
