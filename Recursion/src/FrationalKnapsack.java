package com.pranav;

import java.util.Arrays;

public class FrationalKnapsack {
    public static void main(String[] args) {
        // values{300, 260, 120, 100, 240}
        //weight{20, 20, 10, 10, 30}
        //ratio{15, 13, 12, 10 ,8}
        int[] v = {260, 120, 300, 240, 100};
        int[] weight = {20, 10, 20, 30, 10};
        int w = 80;
        System.out.println("The max profit is : "+fractionalKnapsack(v, weight, w));
    }
    static float fractionalKnapsack(int[] value, int[] weight, int w){
        float[] ratios = ratio(value, weight);
        sort(value, weight, ratios);
        int wght = 0;
        float sack = 0.0F;
        for(int i=0; i < value.length; i++){
            if(wght + weight[i] <= w){
                sack += value[i];
                wght += weight[i];
            }else{
                int remain = w - wght;
                sack += (float)remain * ratios[i];
            }

        }
        return sack;
    }
    static float[] ratio(int[] v, int[] w){
        float[] ans = new float[v.length];
        for(int i=0; i<v.length; i++){
            ans[i] = (float)v[i]/w[i];
        }
        return ans;
    }
    static void sort(int[] v, int[] w, float[] r){
        for(int i=0; i<v.length; i++){
            for(int j=i+1; j<v.length; j++){
                if(r[i] < r[j]){
                    swap(w, i, j);
                    swap(r, i, j);
                    swap(v, i, j);
                }
            }
        }
    }
    static void swap(int[] nums,int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    static void swap(float[] nums,int a, int b){
        float temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
