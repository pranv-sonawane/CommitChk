package com.pranav;

import java.util.Arrays;

public class strictlySortedSearch {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13,14,15,16}
        };
        int[]ans = SearchInStrict2D(arr, 11);
        System.out.println(Arrays.toString(ans));
    }

    //search the row provided between the col provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        int mid = 0;
        while (cStart <= cEnd){
             mid =  cStart + (cEnd -cStart) / 2;
            if (target < matrix[row][mid]){
                cEnd = mid -1;
            }else if (target > matrix[row][mid]){
                cStart = mid + 1;
            }else{
                return new int[]{row, mid};
            }
        }
        return new int[]{-1, -1};
    }
    static int[] SearchInStrict2D(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;    // be cautious the matrix may be empty

        if (rows == 1){
            binarySearch(matrix, 0, 0, cols-1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;
        // run the loop till two rows are remaining
        while (rStart < (rEnd -1)){     //this loop will run until 2 rows are remaining
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target){
                return new int[]{mid, cMid};
            }
            if (matrix[mid][cMid] > target){
                rEnd = cMid -1;
            } else {
                rStart = cMid;
            }
        }

        // now we have two rows
        // Search in 1st half!
        if (target <= matrix[rStart][cMid - 1]){
            return binarySearch(matrix, rStart, 0, cMid-1, target);
        }
        // Search in 2nd half!
        if (target >= matrix[rStart][cMid + 1] && target >= matrix[rStart][cols - 1]){
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        // Search in 3rd half!
        if (target <= matrix[rStart + 1][cMid - 1]){
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        }
        // Search in 4th half!
        if (target >= matrix[rStart + 1][cMid + 1] && target >= matrix[rStart + 1][cols - 1]){
            return binarySearch(matrix, rStart + 1, cMid + 1, cols -1, target);
        }
        return new int[]{-1,-1};
    }
}
