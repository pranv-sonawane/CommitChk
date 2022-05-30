package com.pranav;

import java.util.Arrays;

public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {44,32,-9,52,23,-50,50,33,-84,47,-14,84,36,-62,37,81,-36,-85,-39,67,-63,64,-47,95,91,-40,65,67,92,-28,97,100,81};
        System.out.println(Arrays.toString(largestAltitude(gain)));
    }
    static int[] largestAltitude(int[] gain) {
        int[] altitudes = new int[gain.length + 1];
        int highest = 0, prev = 0;
        int count = 0;
        altitudes[0] = prev;
        while(count < gain.length){
            prev += gain[count];
            altitudes[count + 1] = prev;        //YOU CAN ADD ZERO TO THE START BY DOING COUNT +1 AND STORING VALUES THERE
            count++;
        }
        for(int i = 0; i < altitudes.length; i++){
            if(highest < altitudes[i]){
                highest = altitudes[i];
            }
        }
        return altitudes;
    }
}
