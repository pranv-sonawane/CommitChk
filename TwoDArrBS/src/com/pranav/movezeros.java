package com.pranav;

import java.util.Arrays;

public class movezeros {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
    }
    static void moveZeroes(int[] nums) {
        int temp, count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                count++;
            }
        }
        //move all the non zeroes to the front
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }
        }
        int last = nums.length - 1;
        while (count != 0){
            nums[last] = 0;
            last--;
            count--;
        }
        System.out.println(Arrays.toString(nums));
    }
}
