package com.pranav;

public class LuckNum {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 7, 3, 3};
        findLucky(a);
    }
    static void findLucky(int[] a){
        int d = 0, visited = -1, count;
        int[] secondarr = new int[a.length];
        //find the frequency of every element in the array and mark the repeated elements as visited (-1)
        for (int i = 0; i < a.length; i++) {
            count = 1;          // every element is occured ATLEAST ONCE, the count resets to 1 after checking each element
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]){
                    count++;
                    secondarr[j] = visited;
                }
            }
            if (secondarr[i] != visited){
                secondarr[i] = count;
            }
        }
        //find the max of all the lucky elements in array (a) and print it
        int lucky = 0;
        for (int i = 0; i < secondarr.length; i++) {
            if (secondarr[i] != visited){
                if (secondarr[i] > lucky){
                    lucky = a[i];
                }
            }
        }
        System.out.println(lucky);
    }
}
