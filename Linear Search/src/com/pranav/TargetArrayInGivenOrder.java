package com.pranav;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetArrayInGivenOrder {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 1, 2, 1};
//        System.out.println(Arrays.toString(createTargetArray(nums, index)));
        createTargetArray(nums, index);
    }
    static void createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> target = new ArrayList<>();
        int[] result = new int[nums.length];
        // putting all the elements in new Arraylist
        for (int i = 0; i < index.length; i++) {
            target.add(index[i], nums[i]);
        }
//        for (int i = 0; i < target.size(); i++) {
//            result[i] = target.get(i);
//        }
//        return result;
        System.out.println(target);
    }
}
