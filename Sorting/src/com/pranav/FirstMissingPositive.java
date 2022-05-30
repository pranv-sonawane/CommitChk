package com.pranav;

import java.util.Arrays;

// Leetcode Hard
// https://leetcode.com/problems/first-missing-positive/

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {7,8,9,11,12};
        System.out.println(firstMissingPositive(arr));
    }
    public static int firstMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length){
            int temp = arr[i] - 1;
            if (arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[temp]){
                swap(arr, i, temp);
            }else{
                i++;
            }
        }
        // first case
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1){
                return j + 1;
            }
        }
        // second case
        return arr.length + 1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
