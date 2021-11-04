package com.pranav;

 public class SumOfnDigits {
    public static void main(String[] args) {
        int a = 365, L = a, f, b = 0;
        int count =0;
        while (a>0){
            f = a % 10;
            b += f;
            a = a / 10;
            count ++;
        }
        System.out.println(b);
    }
}
