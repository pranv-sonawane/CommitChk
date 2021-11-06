package com.pranav;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SwapArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        reverse(arr);

    }
    static void swap(int[] a, int index1, int index2){
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }
    static void reverse(int[] a){
        int start = 0, end = a.length -1;    //a.length will give 6 but the array starts with 0 so the arr index should be 5 and hence was giving out of bounds error
        while(start < end){
            //swap
            swap(a, start, end);
            start ++;
            end --;
        }
        System.out.println(Arrays.toString(a));
    }
}
