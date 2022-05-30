package com.pranav;

//https://leetcode.com/problems/missing-number/

class MissingNumber {
    public static void main(String[] args) {
        int array[] = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(array));
    }
    public static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length){
            if (arr[i] < arr.length && arr[i] != i){
                int temp = arr[i];
                swap(arr, i, temp);

            }else{
                i++;
            }
        }
        // first case
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j){
                return j;
            }
        }
        // second case
        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}