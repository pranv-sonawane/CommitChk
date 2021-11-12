package com.pranav;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CustomerWealth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] list = {{1,2,3}, {3,4,5}, {6,7,8}};
//        //input
//        for (int i = 0; i < list.length; i++) {
//            for (int j = 0; j < list[i].length; j++) {
//                list[i][j] = in.nextInt();
//            }
//        }
//        for (int i = 0; i < list.length; i++) {
//            System.out.println(Arrays.toString(list[i]));
//        }
        findWealth(list);
    }
    static void findWealth(int[][] a){
        int[] p = new int[a.length]; int sum;

        for (int rows = 0; rows < a.length; rows++) {
            sum = 0;
            for (int cols = 0; cols < a[rows].length; cols++) {
                sum += a[rows][cols];
            }
            p[rows]= sum;
        }
        sum = 0;
        for (int i = 0; i < p.length; i++) {
            if (sum < p[i])
                sum = p[i];
        }
        System.out.println(sum);
    }
}
