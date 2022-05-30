package com.pranav;

//https://leetcode.com/problems/contains-duplicate/

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(containsDuplicate(arr));
    }
    public static boolean containsDuplicate(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j > 0; j--){
                if(nums[j-1] == nums[j]){
                    return true;
                }
                if(nums[j-1] > nums[j]){
                    swap(nums, j-1, j);
                }else{
                    break;
                }
            }
        }
        return false;
    }
    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
