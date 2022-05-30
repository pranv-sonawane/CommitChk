package com.pranav;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{3,4,5}};
        System.out.println(returnMaxWealth(a));
    }
    static int returnMaxWealth(int[][] arr){
        int rowsum, max = 0;
        for (int[] ints : arr) {
            rowsum = 0;
            for (int anInt : ints) {
                rowsum += anInt;
            }
            if (rowsum > max) {
                max = rowsum;
            }
        }
        return max;
    }
}
