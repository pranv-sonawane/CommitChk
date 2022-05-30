package com.pranav;

import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
        // Here the array is sorted in ascending order          //BINARY SEARCH USED BCZ ITS SORTED ARRAY complexity O(n)
        int[] arr = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr,13)));
    }
    static int[] twoSum(int[] numbers, int target) {
        int start =0, end = numbers.length - 1;
        while (start < end){
            if (numbers[start] + numbers[end] == target){
                return new int[]{start + 1, end + 1};
            }
            else if(numbers[start] + numbers[end] > target){
                end --;
            }else{
                start++;
            }
        }
        return new int[]{-1,-1};
    }
}
