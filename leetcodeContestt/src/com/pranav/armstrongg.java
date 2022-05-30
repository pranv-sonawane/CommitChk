package com.pranav;

public class armstrongg {
    public static void main(String[] args) {

    }
    static boolean isArmstrong(int n){
        int temp = n, count = findDigits(temp), ans;

        while (temp>0){
            temp /= 10;

            count++;
        }

    }
    static int pow(int a, int b){
        for (int i = 0; i < b; i++) {
            a = a * a;
        }
    }
    static int findDigits(int a){
        int temp = a, count = 0;
        //find the number of digits int the number
        while (temp>0){
            temp /= 10;
            count++;
        }
        return count;
    }
}

