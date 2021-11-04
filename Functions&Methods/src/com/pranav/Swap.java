package com.pranav;

public class Swap {
    public static void main(String[] args) {
//        int a =2;
//        int b =3;
//        swap(a, b);
//        System.out.println(a + " "+ b);

        String name = "Pranav Sonawane";        //because this variable "name" is the original refrence and the naam
                                                //is its copy, when we assign another object to naam the original
                                                //reference value does not change...!!!

        changeName(name);                       //here the naam variable and the name variable in the main function
                                                // is reffering to the same object that is "Pranav Sonawane"
        System.out.println(name);
    }

    static void changeName(String naam) { //here the naam variable and the name variable in the main function
                                            // is reffering to the same object that is "Pranav Sonawane"
        naam = "Soumya Shrivastava";
//
    }          /*So the conclusion here is that we were passing the value of the function in the
               main method and there we made a refrence variable and assigned the value of the method we made
               and in the method we also created a variable which was pointing to the same value "Pranav Sonawane"
               but we changed it in the method we created dispite it didn't change the value of original refrence
               variable which is "name".... therefore:: name is a original variable and naam is its copy*/

    static int swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return b;
    }
}
