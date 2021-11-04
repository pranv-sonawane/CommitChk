package com.pranav;

public class Shadowing {    //the variable "x" can be accessed across the whole Shadowing class
    static int x = 99;      //variable with higher scope    //will be shadowed at line no. 9

    public static void main(String[] args) {
        System.out.println(x); //99

        int x;    //class variable at line 4 is shadowed by this     //declaration
                        //variable overlapping the variable with higher scope, so the higher variable is hidden
//        System.out.println(x); //scope will begin when the value is initialised

        x = 20;     //initialisation  

        System.out.println(x); //20

        shadow();      //99     // another method has access to the higher scope
    }
    static void shadow(){
        System.out.println(x);  //
    }
}
