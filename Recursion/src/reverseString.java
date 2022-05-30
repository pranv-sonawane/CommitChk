package com.pranav;

public class reverseString {

    public static void main(String[] args) {
        char[] name = {'p', 'r', 'a', 'n', 'a', 'v'};
        System.out.println(name);
        reverseString(name, 0, name.length - 1);
        System.out.println(name);
    }
    public static void reverseString(char[] s, int i, int j) {
        // base class
        if (i == j || j < i){
            return;
        }

        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;

        reverseString(s, i + 1, j - 1);
    }
}
