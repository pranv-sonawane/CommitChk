package com.pranav;

import java.util.Arrays;

public class sqrOfarr {
    public static void main(String[] args) {
        int[] a = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(a)));
    }
    static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
}
