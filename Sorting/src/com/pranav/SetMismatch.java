package com.pranav;

// https://leetcode.com/problems/set-mismatch/

import java.util.Arrays;

class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {2, 2};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
    public static int[] findErrorNums(int[] nums) {
       int i = 0;

       while (i < nums.length){
           int correctIndex = nums[i] - 1;
           if(nums[correctIndex] != nums[i]){
               swap(nums, i, correctIndex);
           } else {
               i++;
           }
       }

        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j + 1){
                return new int[]{nums[j], j + 1};
            }
        }
        return new int[] {-1, -1};
    }
    static void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}