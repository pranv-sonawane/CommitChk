package com.pranav;

public class Ntol {
    public static void main(String[] args) {
        funBoth(5);
    }
    static void fun(int n){
        // base case
        if (n == 0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
    static void fun1(int n){
        // base case
        if (n == 0){
            return;
        }
        fun1(n-1);
        System.out.println(n);
    }
    static void funBoth(int n){
        // base case
        if (n == 0){
            return;
        }
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }
}
