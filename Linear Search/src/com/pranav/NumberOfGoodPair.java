package com.pranav;

public class NumberOfGoodPair {
    public static void main(String[] args) {
        int[] list = {1,1,1,1};
        System.out.println(numIdenticalPairs(list));
    }
    static int numIdenticalPairs(int[] nums) {
        int goodPair = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    goodPair++;
                }
            }
        }
        return goodPair;
    }
}
