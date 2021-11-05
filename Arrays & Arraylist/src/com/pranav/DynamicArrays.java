package com.pranav;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //syntax
        ArrayList<Integer> list = new ArrayList<>();

//        list.add(32);
//        list.add(86);
//        list.add(543);

//        System.out.println(list);       //you don't need to do Arrays.toString in arraylist

//        System.out.println(list.contains(543)); //checks if the element is present in array or not
//
//        list.set(0, 99); //update the 0th index with value 99
//        System.out.println(list);
//
//        list.remove(2);
//        System.out.println(list);

        //for taking the arraylist input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        //you can't get the elements like list[0] as we did in arrays
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i));
        }
    }
}
