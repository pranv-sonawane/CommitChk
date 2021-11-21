package com.pranav;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, -6, 2},
                {3, 16, 975, 1},
                {8, -12},
                {-29, -32, 78}
        };
        System.out.println(getEleIn2D(arr, -12));
    }

    static int getEleIn2D(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j])
                    return arr[i][j];
            }
        }
        return -1;
    }
}
