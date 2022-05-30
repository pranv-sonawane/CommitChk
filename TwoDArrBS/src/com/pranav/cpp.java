package com.pranav;

public class cpp{
    public static void main(String[] args) {
        String str = "Pranav Swapnil Sonawane";
        int count = 0, i = 0;

        while (i < str.length()){
            if (str.charAt(i)!= ' '){
                count = count +1;
            }
            i++;
        }
        System.out.println("The number of character in this string are : " + count);
    }
}