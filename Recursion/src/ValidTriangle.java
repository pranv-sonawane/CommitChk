package com.pranav;

import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        System.out.println(greatest (a, b, c));
    }
    static String greatest (int a, int b, int c){
        int max;
        if(a>=b && a>=c){
            max = a;
        }else if(b>=c && b>=a){
            max = b;
        }else {
            max = c;
        }

        if(a==max){
            if (b + c > max){
                return "True";
            }
        }else if(b==max){
            if (a + c > max){
                return "True";
            }
        }else{
            if (b + a > max){
                return "True";
            }
        }
        return "False";
    }
}
