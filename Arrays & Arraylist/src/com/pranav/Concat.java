package com.pranav;

import java.util.Arrays;
import java.util.Scanner;

public class Concat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements of x ");
        int n = in.nextInt();
        int[] x = new int[n];
        System.out.println("enter elements: ");
        for (int i = 0; i < n; i++) {
            x[i] = in.nextInt();
        }
        System.out.print("Enter the num of elements of y ");
        int n1 = in.nextInt();
        int[] y = new int[n1];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n1; i++) {
            y[i] = in.nextInt();
        }
        System.out.println(x.length + " " +  y.length);
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));
        System.out.println("Concatination is : ");
        System.out.print(Arrays.toString(concat(x, y)));
    }
    static int[] concat(int[] a, int[] b){
        int[] sum = new int[a.length + b.length];
        for (int i = 0; i < a.length ; i++) {
            sum[i] = a[i];
        }
        int i = 0;
        for (int j = a.length; j < sum.length  ; j++) {
            sum[j] = b[i];
            i++;
        }
        return sum;
    }
}
