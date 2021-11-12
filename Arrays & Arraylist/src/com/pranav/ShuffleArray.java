package com.pranav;

import java.util.Arrays;

public class ShuffleArray {
    static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0)
                ans[i] = nums[n];

            else
                ans[i] = nums[i];

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 2, 1};
        shuffle(arr, 3);
    }
}
