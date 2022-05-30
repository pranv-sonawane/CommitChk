package com.pranav;

public class SelfAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {-34, -20, -8, -1, 0, 2, 3, 4, 8, 16, 43, 84};
        int[] arr = {78, 64, 53, 37, 19, 2, -1, -11, -12, -20};
        int target = 78;
        System.out.println(selfAgnosticBS(arr, target));  //returns the index if present else returns -1
    }
    static int selfAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        //find if array is ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            //find mid
            int mid = start + (end - start) / 2;

            //check mid == target
            if (arr[mid] == target){
                return mid;
            }
            //if ascending
            if (isAsc){
                if (target < arr[mid]){
                    end = mid -1;
                }else
                    start = mid + 1;
            }
            //if descending
            else{
                if (target > arr[mid]){
                    end = mid -1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
