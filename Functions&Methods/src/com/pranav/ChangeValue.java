package com.pranav;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,7};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums) {
        nums[0] = 99;    //if we make a change to the object via this variable the original object will change
    }
}
