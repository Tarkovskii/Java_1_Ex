package com.lesson.first.HW_1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Logger maxArr = new Logger();
        Logger minArr = new Logger();

        int i = random.nextInt(0, 1001);
        System.out.println(i);

        int n = Integer.highestOneBit(i);
        System.out.println(n);


        int sizeMax = maxArr.sizeMaxArray(i, n);
        int[] arrMax = maxArr.createArrayMax(i, n, sizeMax);
        int sizeMin = minArr.sizeMinArray(i, n);
        int[] arrMin = minArr.createArrayMin(i, n, sizeMin);

        maxArr.printArray(arrMax);
        System.out.println("======================");
        maxArr.printArray(arrMin);

    }
}


class Logger {

    int sizeMaxArray(int i, int n) {
        int sizeArray = 0;
        for (int j = i; j < Short.MAX_VALUE; j++) {
            int result = j % n;
            if (result == 0) {
                sizeArray++;
            }
        }
        return sizeArray;
    }

    int sizeMinArray(int i, int n) {
        int sizeMinArray = 0;
        for (int j = i; j != Short.MIN_VALUE; j--) {
            int result = j % n;
            if (result == 0) {
                sizeMinArray++;
            }
        }
        return sizeMinArray;
    }

    int[] createArrayMax(int i, int n, int sizeArray) {
        int[] arrMax = new int[sizeArray];
        int indexArr = 0;
        for (int k = i; k < Short.MAX_VALUE; k++) {
            int result = k % n;
            if (result == 0) {
                arrMax[indexArr] = k;
                indexArr++;
            }
        }
        return arrMax;
    }


    int[] createArrayMin(int i, int n, int sizeMinArray) {
        int[] arrMin = new int[sizeMinArray];
        int indexArr = 0;
        for (int k = i; k != Short.MIN_VALUE; k--) {
            int result = k % n;
            if (result == 0) {
                arrMin[indexArr] = k;
                indexArr++;
            }
        }
        return arrMin;
    }

    void printArray(int[] arr) {
        String arrayStr = "";
        for (int i = 0; i < arr.length; i++) {
            arrayStr += arr[i] + " ";
        }
        System.out.println(arrayStr);
    }


}