package com.pranav;

import java.util.Arrays;

public class RowColMatrix {

    public static void main(String[] args) {
        int[][] arr = {                 // Here the array is not strictly sorted. It is sorted rows and column wise
                {10,20,30,40},
                {12,22,32,42},
                {17,27,37,47},
                {19,29,39,49}
        };
        System.out.println(Arrays.toString(findIn2DArr(arr,10)));
    }
    static int[] findIn2DArr(int[][] matrix, int target){
         int row = 0, col = matrix.length-1;
         // start form col end and decrement while increase the rows simultaneously
        // so 2 checks needs to be added to end the binary search while loop
         while (row <= matrix.length - 1 && col >= 0){
             if (matrix[row][col] == target){
                 return new int[]{row, col};        // This is a valid statement. learn more about the new keyword
             }
             if (matrix[row][col] > target){
                 col --;
             }else {
                 row++;
             }
         }
         return new int[]{-1, -1};
    }
}
