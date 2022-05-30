package com.pranav;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();

        System.out.println(leap(year))  ;
    }
    static String leap(int year){
        if (year % 400 == 0 ){
            return "True";
        }else if (year % 4 == 0 && year % 100 != 0){
            return "True";
        }
        return "False";
    }
}
