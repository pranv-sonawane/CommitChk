package com.pranav;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    static void timeConversion(String s) {
        //get hours
        int h1 = Integer.parseInt(String.valueOf(s.charAt(0)));
        int h2 = Integer.parseInt(String.valueOf(s.charAt(1)));
        int hh = h1 * 10 + h2 % 10;
        if (s.contains("AM")){
            if (hh == 12){
                System.out.print("00");
                for (int i = 2; i < s.length()-2; i++) {
                    System.out.print(s.charAt(i));
                }
            }
            else
                for (int i = 0; i < s.length()-2; i++) {
                    System.out.print(s.charAt(i));
                }
        }
        else {
            hh += 12;
            System.out.print(hh);
            for (int i = 2; i < s.length()-2; i++) {
                System.out.print(s.charAt(i));
            }
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        String s = in.next();

        timeConversion(s);

    }
}



