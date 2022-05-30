package com.pranav;

import java.util.Arrays;

public class sortingAlgos {

    public static void main(String[] args) {
        int[] array = {5, 3, 4, 1, 2};
        insertion(array);
        System.out.println(Arrays.toString(array));
    }

    static void insertion(int arr[]){
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
    }

    static void selection(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            //find the maximum item in the remaining array and swap with correct index i.e at the end of the array
            int last = arr.length - i - 1;
            int maxIndex = maxIndexInArry(arr, 0, last);    // the right half will be sorted in the selection sort
            swap(arr, maxIndex, last);
        }
    }
    static void swap (int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int maxIndexInArry(int[] arr, int start, int last) {
        int max = start;
        for (int i = start; i <= last; i++) {
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }


    static void bubble(int[] arr){
        boolean sorted;
        for (int i = 0; i < arr.length; i++) {
            sorted =false;
            // for every ith pass check if the elements are smaller
            for (int j = 1; j < arr.length - i; j++) {      //initialize the j with 1 to check the element j-1;
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    sorted = true;
                }
            }
            // if the array is sorted no need to check the loop again!
            if (!sorted){
                break;
            }
        }
    }
}
