package com.pranav;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NumsSmallerThanCurrNum {
    public static void main(String[] args) {
        int[] nums = {6,5,4,8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int counter;
        for (int i = 0; i < nums.length; i++) {
            counter = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]){
                    continue;
                }
                if (nums[i] > nums[j]){
                    counter++;
                }
            }
            ans[i] = counter;
        }
        return ans;
    }
}
