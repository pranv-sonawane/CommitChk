package com.pranav;

public class SearchInStringRange {
    public static void main(String[] args) {
        String name = "Pranav Sonawane";
        System.out.println(searchInString(name, 'S', 4, 10));
    }
    static boolean searchInString(String str, char target, int start, int end){
        if (str.length() == 0){
            return false;
        }
        for (int i = start; i <= end; i++) { //we are giving <= bc we are taking the index directly
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
