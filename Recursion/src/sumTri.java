package com.pranav;

import java.util.Arrays;

public class sumTri {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        triangleSum(a);
    }
    static void triangleSum(int[] nums){
        // base class
        if (nums.length < 1){
            return;
        }
        // creating a new temp array and then pass that array
        // as a new parameter in the next function call
        int[] temp = new int[nums.length - 1];
        for (int i = 0; i < nums.length - 1; i++) {
            temp[i] = nums[i] + nums[i + 1];
        }


        // now the recursion call
        triangleSum(temp);

        // after each iteration print the array
        System.out.println(Arrays.toString(temp));
    }
}
