package com.pranav;

public class revStrRec {
    public static void main(String[] args) {
        String a = "bitch";
//        reverseStr(a);
        reverseStr2(a, a.length());
    }
    static void reverseStr(String str){
        // base case
        if (str.length() < 1){
            return;
        }
        String temp = str.substring(0, str.length() - 1);
        // printing the last char first
        // here the string is reduced to n-1 elements eatch time the function is called
        System.out.print(str.charAt(str.length()-1));

        // function recall
        reverseStr(temp);

    }

    static void reverseStr2(String str, int n){
        // base case
        if (n == 0){
            return;
        }
        // printing the last character first
        System.out.print(str.charAt(n - 1));

        // function call
        reverseStr2(str, n-1);
    }
}
