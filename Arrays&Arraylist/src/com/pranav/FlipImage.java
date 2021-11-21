package com.pranav;

import java.util.Arrays;

public class FlipImage {
    public static void main(String[] args) {
        int[][] swaptest = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        flip(swaptest);
    }
    static int[][] flip(int[][] a){
        int start, end, temp;
        for (int i = 0; i < a.length; i++) {
            start = 0; end = a[i].length - 1;
            while (i < end){
                temp = a[i][start];
                a[i][start++] = a[i][end];
                a[i][end--] = temp;
            }
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == 1){
                    a[i][j] = 0;
                }
                else if (a[i][j] == 0)
                    a[i][j] = 1;
                else
                    System.exit(0);
            }
        }
        return a;
        }

}
