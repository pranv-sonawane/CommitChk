package com.pranav;

public class Functions1 {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);

        int ans = add(2,4 );    //calling the function and passing the values in main & assigning it to var. ans
        System.out.println(ans);       // printing the value stored in var ans
    }
    static String greet(){
        String greeting = "Hello, How are you ?";
        return greeting;
    }
    static int add(int a, int b){       //inserting parameters while declaring the method so that we
                                        //insert the values in main method
        int sum = a + b;
        return sum;
    }
}
