package com.pranav;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// switch cases
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();
//        switch (fruit) {
//            case "mango" -> System.out.println("King of Fruits");
//            case "grapes" -> System.out.println("Small green fruit");
//            case "apple" -> System.out.println("Sweet red fruit");
//            default -> System.out.println("Please enter a valid fruit!");

        int empId = in.nextInt();
        String dept = in.next();

        switch (empId) {
            case 1 -> {
                System.out.println("Pranav Sonawane");
                switch (dept) {
                    case "computer" -> System.out.println("Computer Department");
                    case "mbbs" -> System.out.println("Medical Department");
                    default -> System.out.println("Invalid Department!");
                }
            }
            case 2 -> {
                System.out.println("Soumya Shrivastava");
                switch (dept) {
                    case "computer" -> System.out.println("Computer Department");
                    case "mbbs" -> System.out.println("Medical Department");
                    default -> System.out.println("Invalid Department!");
                }
            }
            case 3 -> {
                System.out.println("The Boogeyman");
                switch (dept) {
                    case "computer" -> System.out.println("Computer Department");
                    case "mbbs" -> System.out.println("Medical Department");
                    default -> System.out.println("Invalid Department!");
                }
            }
            default -> System.out.println("Please enter correct id !");
        }
    }
}
