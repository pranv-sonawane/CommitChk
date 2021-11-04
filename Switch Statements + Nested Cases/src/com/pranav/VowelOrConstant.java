package com.pranav;

import java.util.Scanner;

public class VowelOrConstant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char a;
        System.out.print("Enter a single letter to check if it is a vowel or constant: ");
        a = in.next().trim().charAt(0);

        switch (a){
            case 'a' -> System.out.println(a +" Is a vowel");
            case 'e' -> System.out.println(a + " Is a vowel");
            case 'i' -> System.out.println(a + " Is a vowel");
            case 'o' -> System.out.println(a + " Is a vowel");
            case 'u' -> System.out.println(a + " Is a vowel");
            case 'A' -> System.out.println(a +" Is a vowel");
            case 'E' -> System.out.println(a + " Is a vowel");
            case 'I' -> System.out.println(a + " Is a vowel");
            case 'O' -> System.out.println(a + " Is a vowel");
            case 'U' -> System.out.println(a + " Is a vowel");
            default -> System.out.println(a + " Is a constant");

        }

    }
}

