package com.pranav;

import java.util.ArrayList;

public class CheckIfPangram {
    public static void main(String[] args) {
        String str = "aquickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(str));
    }
    static boolean checkIfPangram(String sentence) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        char[] alpha1 = alpha.toCharArray();
        char[] sentence1 = sentence.toCharArray();
        int count = 0;
        for(int i = 0; i < sentence1.length; i++){
            for(int j = 0; j < alpha1.length; j++){
                if(sentence1[i] >= 97 && sentence1[i] <= 122){
                    if(sentence1[i] == alpha1[j]){
                        alpha1[j] = '0';
                        count++;
                    }
                }
            }
        }
        if (count == 26){
            return true;
    }
        return false;
    }
}
