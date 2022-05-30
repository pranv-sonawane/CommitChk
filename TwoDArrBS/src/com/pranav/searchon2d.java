package com.pranav;

public class searchon2d {
    public static void main(String[] args) {

            int[][] a = {
                    {1},
                    {3}
            };
            boolean ans = searchMatrix(a,0);
        System.out.println(ans);

    }
    static boolean searchMatrix(int[][] matrix, int target) {
        int row = 0, col = matrix.length -1;
        if (matrix.length == 1){
            return binarySearch(matrix[0], target);
        }
        while(row <= matrix.length -1 && col >= 0){
            // 1st condition
            if(matrix[row][col] == target){
                return true;
            }
            if(matrix[row][col] > target ){
//                if(matrix[row][col]. == )col--;
            }else{
                row++;
            }
        }
        return false;
    }
    static boolean binarySearch(int[] a, int target){
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
            else return true;
        }
        //if the element not found return -1
        return false;
    }
}
