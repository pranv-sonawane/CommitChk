package com.pranav;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class prnv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Explicit TypeCasting
//        int a = (int) (67.85f);
//        System.out.println(a);

//        Automatic conversion is done by java
//        Float b = input.nextFloat();
//        System.out.println(b);

//        Automatic type promotion in expressions
//        int a = 258;
//        byte b = (byte) (a);//A byte can contain value upto only 256 so java will give the remainder of
        // 256 % 258 = 2
//        System.out.println(b);

//       Self Promoting
//        byte c = 50;
//        byte d = 30;
//        byte e = 80;
//        float f = c * d / e;//here java is automatically promoting the byte variables to int in the expression only and the output is shown in the integer
//        System.out.println(f);//also the output should be 18.75 and it is rounding off to 18

//        if we do this
//        byte a = 30;
//        a = a * 2; //Here java is promoting the datatype and thats why we cannot assign back the integer value
//                   to the byte

        //Atomatic Promotion
//        int number = 'A';
//        System.out.println(number); //Will return the ASCII value of charater 'A'

//        System.out.println(3 * 5.4f); //this is an example of promoting

//        //boolean = // 1 Bit {True/False}
//        byte b = 127; // 1 byte
//        short s = 1024; //2 bytes
//        char c = 'c'; //2 bytes
//        int i = 50; //4 bytes
//        float f = 2.4f; //4 bytes
//        long l = 2242424242l; //8 bytes
//        double d = 887777897979d; //8 bytes
//
//        System.out.println((c * f)+(l + s) -(b-d));
//        System.out.println((c * f)+ " " +(l + s)+" "+(b-d));//shows which number is auto-promoted to which datatype


    }

}
