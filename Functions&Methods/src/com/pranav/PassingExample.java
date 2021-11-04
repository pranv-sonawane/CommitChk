package com.pranav;

public class PassingExample {
    public static void main(String[] args) {
        String abc = "shfihs";
        greet(abc);                 //for ex here we are assigning another variable abc and it contains some object
                                    // but the argument in the function we're calling is changed and the function does
                                    // not care until the object of the new variable that is "abc" is String !!
    }

    static void greet(String nam) { //the nam variable here does not need to have the same name in the main
        System.out.println(nam);
    }

}
