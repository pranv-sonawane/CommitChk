package com.pranav;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] dbz = new long[5];
        for (int i = 0; i < dbz.length; i++) {
            dbz[i] = in.nextInt();
        }
//        System.out.println(Arrays.toString(dbz));
        minmaxsum(dbz);
    }
    static int min(long[] arr){
        double minimum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (minimum > arr[i])
                minimum = arr[i];
        }
        return (int) minimum;
    }
    static int max(long[] arr){
        long maximum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maximum < arr[i])
                maximum = arr[i];
        }
        return (int) maximum;
    }
    static void minmaxsum(long[] arr){
        long minsum = 0, maxsum = 0;
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] != max(arr)){
                minsum += arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] != min(arr)){
                maxsum += arr[i];
            }
        }
        System.out.println(minsum + " " + maxsum);
    }
}
