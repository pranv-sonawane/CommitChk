package com.pranav;

import java.util.Scanner;

public class MinMaxArr {
    public static void main(String[] args) {
        int[] dbz = new int[5];
        arr(dbz);
    }
    static void arr(int[] a){
        Scanner in = new Scanner(System.in);
        int max = 0, min = 0, larg = 0, smol = 0;
        int[] temp;
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        temp = a;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = i;
        }
        temp[max] = 0;
        for (int i = 0; i < a.length; i++) {
            smol+=a[i];
        }
        System.out.println("sum of smallest possible numbers is " + smol);
    }
}
