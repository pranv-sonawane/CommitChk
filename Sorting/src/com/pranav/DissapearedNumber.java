package com.pranav;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

class DissapearedNumber {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(arr));
    }

    static ArrayList<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correct = nums[i] - 1;
            if (nums[i] <= nums.length && nums[i] != correct && nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }

        ArrayList<Integer> arr = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
          if (nums[j] - 1 != j){
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