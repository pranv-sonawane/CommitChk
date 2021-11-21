package com.pranav;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Pranav";
        System.out.println(searchInString2(name, 'v'));;
    }
    static boolean searchInString2(String str, char target){
        if (str.length() == 0){
            return false;
        }
        for (char element : str.toCharArray()){ //we converted the string into character array
            if (element == target){
                return true;
            }
        }
        return false;
    }

    static boolean searchInString(String str, char target){
        if (str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
