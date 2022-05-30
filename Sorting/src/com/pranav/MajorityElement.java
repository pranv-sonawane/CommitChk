package com.pranav;

//https://leetcode.com/problems/majority-element/

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr ={2, 2};
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        if (n == 1){
            return nums[0];
        }else if(n < 1){
            return -1;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (nums[j] < nums[j-1]){
                    swap(nums, j, j-1);
                }else{
                    break;
                }
            }
        }
        int count = 0;
        int temp = nums[0];

        for(int k = 0; k < nums.length; k++){
            if(temp == nums[k]){
                count++;
            }else{
                temp = nums[k];
                count = 1;
            }
            if(count > n / 2){
                return nums[k];
            }
        }
        return -1;

    }
    static void swap (int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
