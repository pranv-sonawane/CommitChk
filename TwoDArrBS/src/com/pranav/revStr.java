package com.pranav;

import java.util.Arrays;

public class revStr {
    public static void main(String[] args) {
        String str = "this is so stupid !!";
        System.out.println(reverseWords(str));

//        System.out.println(Arrays.toString(words));
//
    }
        static String reverseWords(String s) {
            String[] wordarr = s.split("\\s");
            String reversedString = "";
            for(int i = 0; i < wordarr.length - 1; i++){
                String currword = wordarr[i];
                String reversedword = "";
                for(int j = 0; j <= currword.length() -1; j++){
                    reversedword = currword.charAt(j) + reversedword;
                }
                reversedString += reversedword + " ";
            }
            return reversedString;
        }

}
