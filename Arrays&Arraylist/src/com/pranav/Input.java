package com.pranav;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int[] arr = new int[5];
//
//        arr[0] = 23;
//        arr[1] = 938;
//        arr[2] = 745;
//        arr[3] = 28;
//        arr[4] = 46;
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        for (int j : arr) {     // for every element in the array, print the element
//            System.out.print(j + " "); // here j represents the element of array
//                                    // this loop is for each( : ) loop;
//        }
        String [] str = new String[5];
        for(int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

    }
}
