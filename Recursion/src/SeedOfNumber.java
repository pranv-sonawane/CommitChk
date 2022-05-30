package com.pranav;

import java.util.Scanner;

public class SeedOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useDelimiter("\\D");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.println(seed(num1, num2));
    }
    static String seed(int x, int y){
        int num = x, temp, ans = 1;
        while (num > 0){
            temp = num % 10;
            ans *= temp;
            num = num / 10;
        }
        ans *= x;
        if (ans == y){
//            System.out.println(ans);
            return "True";
        }
//        System.out.println(ans);
        return "False";
    }
}
