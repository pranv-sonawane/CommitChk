package com.pranav;

import java.util.Scanner;

public class TwoNumLcm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n1, n2, L;
        System.out.println("Enter two Positive integers: ");
        n1 = 3;
        n2 = 4;


        for ( L =n1>n2?n1:n2 ;L <= n1 * n2 ; L+=(Math.max(n1, n2))) {  //max num can also be found
                                                                        // with n1>n2?n1:n2 and the Math.max
            if (L % n1 == 0 && L % n2 == 0){
                break;
            }
        }

        System.out.println("LCM is "+L);
    }
}
