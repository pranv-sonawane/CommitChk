package com.pranav;

import java.util.Scanner;

public class TwoNumHcf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  a , b, L = 0;
        a = in.nextInt();
        b = in.nextInt();
        for (int i = 1; i <= (a<b?a:b) ; i++) {
            if (a % i == 0 && b % i == 0){
                L = i;
            }
        }

        System.out.println("HCF is " + L);

    }
}
