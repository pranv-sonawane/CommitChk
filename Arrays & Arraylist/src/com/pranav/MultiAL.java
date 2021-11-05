package com.pranav;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiAL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int [][]
        //declaring arraylist of arraylist(s)
        ArrayList<ArrayList<Integer>> list  = new ArrayList<>(); //Multidimensional ArrayList

        //Initialising 3 empty arraylists
        for (int i = 0; i <3; i++) {            // if we don't initialise it will give error as index out of bounds bc it is arralist of arraylists(s)
            list.add(new ArrayList<>());        // adding 3 empty arrayLists
        }

        for (int i = 0; i < 3; i++) { //for rows
            for (int j = 0; j < 3; j++) { //for columns (each element in an arraylist
                list.get(i).add(in.nextInt());  //here were getting arraylist at index i and add something 3 times
            }
        }

        System.out.println(list);
    }
}
