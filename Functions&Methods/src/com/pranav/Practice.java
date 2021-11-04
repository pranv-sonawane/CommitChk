package com.pranav;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {

//        demo(1, 3 ,4);
//        demo("Pranav Sonawane");

//        demo( ); //No input is given so the compiler cannot decide which function to call
            int a  = cb(11);
        System.out.println(a);
    }

    static int cb(int n){
        int c = n / 2;
        return c;
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

}
