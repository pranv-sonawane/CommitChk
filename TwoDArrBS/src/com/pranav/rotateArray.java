package com.pranav;

import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotate(arr, 3);
    }
    static void rotate(int[] nums, int k) {

        k = k % nums.length;

        //reverse the whole array
        swap(nums, 0, nums.length - 1);

        //reverse the left part of array till k elements
        swap(nums, 0, k - 1);

        //reverse the right part of array
        swap(nums, k, nums.length - 1);

        System.out.println(Arrays.toString(nums));

    }
    static void swap(int[] nums, int l, int r){
        while (l <= r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;

            l++;
            r--;
        }
    }
}
