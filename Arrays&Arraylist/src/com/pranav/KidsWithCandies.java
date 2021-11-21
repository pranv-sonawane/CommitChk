package com.pranav;

import java.util.ArrayList;
import java.util.Scanner;

public class KidsWithCandies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int[] candies = {4,2,1,1,2};
       int remainingCandies = in.nextInt();
        System.out.println(kidsWithCandies(candies, remainingCandies));
    }
    static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        ArrayList<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            //finding the maximum number in the array
            for (int j = 1; j < candies.length; j++) {
                if (candies[j] > max){
                    max = candies[j];
                }
            }
            if (max <= extraCandies + candies[i]){
                ans.add(true);
            }
            else
                ans.add(false);
        }
        return ans;
    }
}
