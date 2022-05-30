package com.pranav;

public class armstrong {
    public static void main(String[] args) {
        int n = 370, x = n;
        int ans = 0;
        while (x > 0){
            int temp = x % 10;
            ans = ans + temp * temp * temp;
            x = x /10;
        }
        if (ans == n){
            System.out.println(ans+" is armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }

    }
}
