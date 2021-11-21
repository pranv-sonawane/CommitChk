package com.pranav;

import java.util.Arrays;

public class ShuffleArr {

    static void shuffle(int [] a, int n){
        int[] ans  = new int[2 * n];
        int len = 2 * n, k = n, b = 0, c = 0 ;
        while (b<2*n){
            ans[b++] = a[c++];

            ans[b++] = a[k++];
            
        }
        System.out.println(Arrays.toString(ans));
    }

    public static void main(String[] args) {
        int n = 2;
        int[] arr = {1, 4, 3, 1};

        shuffle(arr, n);
    }
}
