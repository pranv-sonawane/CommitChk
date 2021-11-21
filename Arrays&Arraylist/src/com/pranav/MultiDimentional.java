package com.pranav;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimentional {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4};
//        System.out.println(Arrays.toString(arr));
//        arr(arr);       //call by value
//        System.out.println(Arrays.toString(arr));

        int[][] abc = new int[3][3];
        arr2D(abc);

    }
    static void arr(int[] a){       //here the array a is an parameter
                                    // pass by value is making the copy of the reference variable
        a[0] = 99;
    }

    static void arr2D(int[][] a){
        Scanner in = new Scanner(System.in);
        //input
        for (int rows = 0; rows < a.length; rows++) {
            for (int cols = 0; cols < a[rows].length; cols++) { //a[rows] is column of individual array
                a[rows][cols] = in.nextInt();
            }
        }
        //output
//        for (int rows = 0; rows < a.length; rows++) {
//            for (int cols = 0; cols < a[rows].length; cols++) {
//                System.out.print(a[rows][cols] + " ");
//            }
//            System.out.println();
//        }
//        for (int rows = 0; rows < a.length; rows++) {
//            System.out.println(Arrays.toString(a[rows]));       //we can use Arrays.toString instead of the column loop
//        }
        for (int[] b : a){                                      //doing same thing as the above for loop just enhanced
            System.out.println(Arrays.toString(b));
        }

    }
}
