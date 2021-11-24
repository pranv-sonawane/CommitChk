package com.pranav;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertInFilledArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int n = 4;
        int newArr[] = new int[n+1];
        int value = 7;
        int end = arr.length;
        System.out.println(Arrays.toString(arr));
        for (int i = arr.length; i > 0; i--) {
            newArr[i] = arr[i - 1];
        }
        newArr[0] = 0;
        System.out.println(Arrays.toString(newArr));
    }



}
