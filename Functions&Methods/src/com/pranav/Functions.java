package com.pranav;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many times do you want to run the loop ? ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
//            add();//function call

            int ans = add1();//here the function will return the value of whats written in it.
            System.out.println(ans); //here the add1() method is called and the value is stored in refrence variable
            //called "ans"
        }
    }
    static void add (){                             //This here "add() is a function the main method is
                                                        // calling the function as many times the user wishes
                                                             //to add the numbers
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = a + b;
        System.out.println("The sum of two given numbers is : "+c); //Here we are just displaying the sum
                                                                    // and not returning it so lets look at an ex.
    }                                                               //so the return type is void
    static int add1(){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = a + b;
        return add1();//here the add1() method is returning a int value
         //so we gave the return type as int while declaring it
    } //if we did not give the return type as int didn't returned the integer value it'll show error
    // and if we declared the function as void and returned int value it'll show an error.
}
