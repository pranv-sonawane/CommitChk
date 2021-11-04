package com.pranav;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        boolean ans = isPrime(n);
//        System.out.println(ans);

        for (int i = 100; i < 1000 ; i++) {
           if (isArmstrong(i)) {
                System.out.println(i + " ");
            }
        }
    }
    // print all the 3 digits armstrong numbers
    static boolean isArmstrong(int num){
        int cube = 0, sum = 0, a = 0;
        int orignal = num;
        while (num>0){
            a = num % 10;
            cube += a * a * a;
            sum += cube;
            num = num /10;
        }
        return cube == orignal; //if this statement  is true it will return true else false;
    }



    static boolean isPrime(int num){
        int i = 2;          //we need just to search if the numbers between 1 and that number is divisible by that number
        if (num <= 1)        //so we will start loop from 2
            return false;
        while (i * i <= num){
            if (num % i == 0){
                return false;   //Prime number dosen't have factors except 1 and itself
            }
            i++;
        }
        if (i * i > num){       //we are excluding 1 and that number so, we didn't entered i * i >= num
            return true;       // if i * i is greater then stop and return that number is prime
                                // bc we are checking if the number is divisible. if it is then it is not prime
            //but the number is not divisible so here goes that the number is prime
        }
        return false;            //else return number is prime

        // the name of the function is "isPrime" return true if prime else return false
    }
}
