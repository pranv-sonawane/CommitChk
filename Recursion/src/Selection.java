package com.pranav;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {55, 6, 223 ,5, 78};
        System.out.println("Array before sorting : " + Arrays.toString(arr));
        System.out.println("Array before sorting : " + Arrays.toString(selection(arr)));

    }
    static int[] selection (int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    j++;
                }
                if(arr[i] < arr[j]){
                    swap(arr, i, j);
                }
            }
        }
        return arr;
    }
    static void swap(int[] arr, int j, int i){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
