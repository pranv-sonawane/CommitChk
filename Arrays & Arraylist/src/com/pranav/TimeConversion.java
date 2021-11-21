package com.pranav;

import java.util.Scanner;

public class TimeConversion {
    static void convertTo24(String str){
        //get hours
        String hh = str.substring(0, 2);

        if (str.contains("AM")){
            if (str.substring(0,2).equals("12")){
             hh = "00";
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        time = time.substring(0, 10);
        convertTo24(time);
    }

}
