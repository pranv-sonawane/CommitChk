package com.pranav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String naam = in.next();
        String greet = personalised(naam);
        System.out.println(greet);
    }
    static String personalised (String name){
        String per = "Hello " + name;
        return per;
    }
}
