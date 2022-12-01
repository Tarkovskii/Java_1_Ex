package com.lesson.first.HW_2_4;

public class Main {
    public static void main(String[] args) {
        StringBuilder newText = new StringBuilder();
        String text = "два плюс два = четыре,пять плюс пять = одинадцпть";
        String s = " = ";
        System.out.println(text);

        for (int i = 0; i < text.length(); i++) {
            newText.append(text.charAt(i));
            if (text.charAt(i) == s.charAt(1)) {
                newText.deleteCharAt(i);
                newText.append("равно");
            }

        }
        System.out.println(newText);
    }
}
