package com.lesson.first.HW_2;

import java.awt.image.BufferStrategy;
import java.nio.Buffer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String strOrig = "this is a test string";
        String strTest = "tist";

        System.out.println(foundWind(strOrig, strTest));


    }

    static String foundWind(String str, String test) {
        StringBuffer bs;
        String minWind = str;

        for (int i = 0; i < str.length(); i++) {
            int j = 0;
            int checkIndex = -1;
            int count = 0;
            String wind = "";

            while (count < test.length() && i + j < str.length()) {
                wind += Character.toString(str.charAt(i + j));
                bs = new StringBuffer(test);
                count = 0;
                j++;
                for (int k = 0; k < wind.length(); k++) {
                    for (int l = 0; l < bs.length(); l++) {
                        if (bs.charAt(l) == wind.charAt(k) && checkIndex != k) {
                            checkIndex = k;
                            bs.delete(l, ++l);
                            count++;
                        }


                        if (count == test.length()) {
                            String checkLen = wind;

                            if (minWind.length() > checkLen.length()) {
                                minWind = wind;
                            }
                        }
                    }
                }
            }

        }
        return minWind;
    }
}
