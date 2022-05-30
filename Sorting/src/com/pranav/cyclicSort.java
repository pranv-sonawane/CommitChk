package com.pranav;

import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1, 6 };
        cyclicSrt(arr);
        System.out.println(Arrays.toString(arr));
    }

    //Cyclic sorting is to sort the array in linear time complexity (so we have to use one single for loop)

    static void cyclicSrt(int[]  arr){
        int i = 0;
        while (i < arr.length){
            if (arr[i] - 1 != i){
                int temp = arr[i] - 1;
                swap(arr, i, temp);

            }else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
