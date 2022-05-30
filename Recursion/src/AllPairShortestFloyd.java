package com.pranav;

// All Pair Shortest Path using Floyd Warshal Algo

public class AllPairShortestFloyd {
    public static void main(String[] args) {
//        int[][] matrix = {
//                {0, 3, 999, 999},
//                {999, 0, 12, 5},
//                {4, 9999, 0, -1},
//                {2, -4, 999, 0}
//        };
        int[][] matrix = {
                {0, 3, 6, 999, 999, 999 ,999},
                {3, 0, 2, 1, 999, 999, 999},
                {6, 2, 0, 1,4,2, 999},
                {999, 1, 1, 0, 2, 999, 4},
                {999, 999, 4, 2, 0, 2, 1},
                {999, 999, 2, 999, 2, 0 ,1},
                {999, 999, 999, 4, 1, 1, 0}
        };
        floydWarshall(matrix);
    }
    static void floydWarshall(int[][] matrix){
        for (int k = 0; k < matrix.length; k++) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (i == k){
                        continue;
                    }
                    if (j == k){
                        continue;
                    }
                    if (i == j){
                        continue;
                    }
                    if (matrix[i][j] > matrix[i][k] + matrix[k][j]) {
                        matrix[i][j] = matrix[i][k] + matrix[k][j];
                    }
                }
            }
        }

        System.out.println("The all pair matrix is : \n");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
