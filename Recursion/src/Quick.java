package com.pranav;

import java.util.Arrays;
import java.util.Scanner;

public class Quick {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {31, 25, 4, 78,35, 15, 2, 55};

        System.out.println(Arrays.toString(quickSort(arr, 0, arr.length - 1)));
    }
    static int[] quickSort(int[] nums, int start, int end){
        int i, j, pivot;
        if(start<end){
            pivot = nums[start];
            i = start;
            j = end;
            while (i<j){
                while (nums[i]<=pivot && i!=end){
                    i++;
                }
                while (nums[j]>pivot){
                    j--;
                }
                if (i<j){
                    swap(nums, i, j);
                }
            }

            swap(nums, start, j);
            quickSort(nums, start, j-1);
            quickSort(nums, j + 1, end);
        }
        return nums;
    }
    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
