package com.pranav;

import java.util.ArrayList;

// https://leetcode.com/problems/find-all-duplicates-in-an-array/

public class FindAllDuplicates {
    public static void main(String[] args) {

    }

    public ArrayList<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] <= nums.length && nums[i] != correct && nums[correct] != nums[i]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int j = 0; j < nums.length; j++){
            if(nums[j] - 1 != j){
                arr.add(nums[j]);
            }
        }
        return arr;
    }

    static void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
