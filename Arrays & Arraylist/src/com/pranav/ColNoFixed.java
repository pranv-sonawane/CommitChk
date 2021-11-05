package com.pranav;

public class ColNoFixed {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8}
        };
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {   //arr[row].length is because we need to run the loop till the length of that particular array and the 2d array can be of uneven column
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
