package com.pranav;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        int[][] a = {
                {1,3}
        };
         searchMatrix(a,3);
    }

    static boolean searchMatrix(int[][] matrix, int target) {
        int row = 0, col = matrix.length -1;
        while(row <= matrix.length -1 && col >= 0){
            // 1st condition
            if(matrix[row][col] == target){
                return true;
            }
            if(matrix[row][col] > target){
                col--;
            }else{
                row++;
            }
        }
        return false;
    }
}
