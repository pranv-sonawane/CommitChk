package com.pranav;

import java.util.Arrays;
import java.util.Scanner;

public class BDayCandles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] bday = new int[n];
        for (int i = 0; i < bday.length; i++) {
            bday[i] = in.nextInt();
        }
//        System.out.println(Arrays.toString(bday));
        max(bday);
    }
    static void max(int [] arr){
        int m = arr[0], count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > m)
                m = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (m == arr[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
