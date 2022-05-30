package com.pranav;

public class StrRevRecursion {
    public static void main(String[] args) {
        int[] arr = {23, 344, 6, 22, -8, 0, -77};
        char[] str = {'s','o','u','m','y','a'};
        helper(0, str);
    }
    private static void helper(int index, char [] str) {
        if (str == null || index >= str.length) {
            return;
        }
        helper(index + 1, str);
        System.out.print(str[index]);
    }
}
