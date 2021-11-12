package com.pranav;

import java.util.Arrays;

public class RunningSUM {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(runningSum(arr)));
    }
    static int[] runningSum(int[] a){
        int prev = 0;
        int[] sum = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            prev += a[i];
            sum[i] = prev;
        }
        return sum;
    }
}
