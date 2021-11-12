package com.pranav;

    import java.util.Arrays;

    public class Permutation {
        public static void main(String[] args) {
            int[] nums = {0, 3, 2, 4, 1};
            int[] ans = new int[4];

            ans[0] = nums[nums[2]];
            System.out.println(Arrays.toString(ans));

        }
    }

