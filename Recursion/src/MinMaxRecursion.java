package com.pranav;

public class MinMaxRecursion {
    public static void main(String[] args) {
//        int[] arr = {34, 6, -45, -2, 44, 21, 1, 0};
//        int minn = min(arr, 0, arr.length - 1);
//        System.out.println(minn);
    }
//
//    static int min(int[] arr, int index, int len) {
//        if (index >= len - 1) {
//            if (arr[index] < arr[index + 1]) {
//                return arr[index];
//            }
//            return arr[index + 1];
//        }
//
//        int min = min(arr, index + 1, len);
//
//        if (arr[index] < min) {
//            return arr[index];
//        } else
//            return min;
//    }
//
//    static int minMax(int[] nums, int s, int e, int min, int max){
//        if (s == e){
//            min = nums[e];
//            max = nums[e];
//        }
//        else{
//            if (s == e - 1){
//                if (nums[s] > nums[e]){
//                    max = nums[s];
//                    min = nums[e];
//                }else{
//                    max = nums[e];
//                    min = nums[s];
//                }
//            }
//            else{
//                int mid = (s + e) / 2;
//                minMax(nums, s, mid -1, min, max);
//                minMax(nums, mid + 1, e, min, max);
//            }
//        }
//    }
}
