package com.pranav;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {-34, -20, -8, -1, 0, 2, 3, 4, 8, 16, 43, 84};
        int target = -20;
        System.out.println(binarySearch(arr, target));  //returns the index if present else returns -1
    }
    static int binarySearch(int[] a, int target){
        int start = 0;
        int end = a.length -1;

        while (start <= end){
            //find the mid element of the array
//            int mid  = (start + end) /2;       //the addition of start and end can exceed the int range
            int mid = start + (end - start) /2;    //so we can do this instead
            //if the target is less than mid element in the arr thn search left
            if (target < a[mid]){
                end = mid -1;
            }
            else if (target > a[mid]){     //if target is greater than mid element in the array then search the right side
                start = mid + 1;
            }
            else return mid;
        }
        //if the element not found return -1
        return -1;
    }

}
