package com.pranav;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] abc = {56, 22, 1, 4, 6, 19, 23, 111, 0, -4};
        quickSrt(abc, 0, abc.length -1);
        System.out.println(Arrays.toString(abc));


    }
    static void quickSrt(int[] nums, int start, int end){
        int i, j, pivot;
        i = start;
        j = end;
        pivot = nums[start];
        while (i < j){
            while (nums[i] <= pivot && i != end){
                i++;
            }
            while (nums[j] > pivot && j != start){
                j--;
            }
            if (i < j){
                swap(nums, i, j);
            }
        }
        swap(nums, start, j);
        quickSrt(nums, start, j-1);
        quickSrt(nums, j+1, end);
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }

}
