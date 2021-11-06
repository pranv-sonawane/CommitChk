package com.pranav;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMax {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);

        int[] a = {1, 3, 35 ,34, 2, 6, 8, 12};
        System.out.println(rangeMax(a, 1, 0));
        System.out.println(arrMax(a));
    }
    static int rangeMax(int[] arr, int index1, int index2){

        if (index2 < index1)
            return -1;

        if (arr == null)
            return -1;

        int Max = arr[index1];
        for (int i = index1; i <= index2; i++) {
           if (arr[i] > Max)
               Max = arr[i];
        }
        return Max;
    }
    static int arrMax(int[] arr){

        if (arr.length == 0){
            return -1;
        }

        int Max = arr[0];
        for (int i = 0; i < arr.length; i++) {
           if (arr[i] > Max)
               Max = arr[i];
        }
        return Max;
    }
}
