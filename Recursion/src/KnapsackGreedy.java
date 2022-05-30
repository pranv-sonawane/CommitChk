package com.pranav;
import java.util.Collections;
import java.util.List;

public class KnapsackGreedy {
    public static void main(String[] args) {
        int [][] values = {
                {300, 20},
                {260, 10},
                {120, 20},
                {100, 30},
                {240, 10}
        };
    }
    static int[][] selection (int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (ratios(arr, arr[i][0], arr[i][1]) > ratios(arr, arr[j][0], arr[j][1])){
                    j++;
                }
                if(ratios(arr, arr[i][0], arr[i][1]) < ratios(arr, arr[j][0], arr[j][1])){
                    swap(arr, arr[i], arr[j]);
                }
            }
        }
        return arr;
    }
    static int ratios(int[][] arr, int first, int second){
        return first / second;
    }
    static void swap(int[][] arr, int[] j, int[] i){

    }
}
