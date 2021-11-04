package com.pranav;

import javax.swing.*;
import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        if (year % 4 == 0 && year % 400 == 0 ){
            System.out.println(year+" is a leap year (Contains 366 days)");
        }
        else
            System.out.println(year+" is not a leap year (has 365 days)");
    }
}
