package com.pranav;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Enter "+ a.length +" elements");
        //input
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        //output
        System.out.println(Arrays.toString(a));


        System.out.println("The max value in this array is: "+arrMax(a));
        System.out.println("The min value in this array is: "+arrMin(a));

    }
    static int arrMax(int[] arr){
        int max = 0;
        for (int i : arr) {
            if (max < i) {
                max = i;
            }

        }
        return max;
    }
    static int arrMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i < 4; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
