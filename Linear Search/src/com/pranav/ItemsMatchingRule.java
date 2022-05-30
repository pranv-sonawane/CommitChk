package com.pranav;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ItemsMatchingRule {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        //initialization of arraylists of arraylist
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        //add elements into the 2d arraylist
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.next());
            }
        }
        System.out.println(list);
        String ruleKey = "color";
        String ruleValue = "silver";
        System.out.println(countMatches(list, ruleKey, ruleValue));
        }
    static int countMatches(ArrayList<ArrayList<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        if (ruleKey.equals("type")){        //always use .equals to compare two strings instead using ==
            for (int i = 0; i < items.size(); i++) {
                if (ruleValue.equals(items.get(i).get(0))){
                    count++;
                }
            }
            return count;
        }else if (ruleKey.equals("color")){
            for (int i = 0; i < items.size(); i++) {
                if (ruleValue.equals(items.get(i).get(1))){
                    count++;
                }
            }
            return count;
        }else if (ruleKey.equals("name")){
            for (int i = 0; i < items.size(); i++) {
                if (ruleValue.equals(items.get(i).get(2))){
                    count++;
                }
            }
            return count;
        }
        //if rulekey is invalid
        return -1;
    }
}
