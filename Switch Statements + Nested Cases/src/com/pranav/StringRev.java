package com.pranav;

public class StringRev {
    public static void main(String[] args) {
        String str = "Bat";
        char last;
        String rev = "";
        int count = str.length();

        while (count>0){
            last = str.charAt(str.length()-1);
            rev = rev + last;
            str = str.substring(0,count-1);
            count --;
        }
        System.out.println(rev);

    }
}
