package com.pranav;

public class minMaxDivideAndConquer {
    public static void main(String[] args) {

    }
    static int findMin(int[] nums, int s, int e, int index){
        // base class
        if (s==e){
            return e;
        }
        if (e-1==s){
          return nums[s]>nums[e]?e:s;
        }
        return e;
    }
}
