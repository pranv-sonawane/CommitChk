package com.pranav;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {1, 766, 4, 1, -5, 92, 3, 89};
        getMin(arr);
    }

    static void getMin(int[] arr) {
        if (arr.length == 0){
            return;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println(min);
    }

}
