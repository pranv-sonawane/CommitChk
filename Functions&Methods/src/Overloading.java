import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
        // when we create two or more methods with the saame name those two function overloads and causes an error
        //so until we give diffrent parameters to separate those function with similar names the java allows us to create those functions

        fun("Pranav"); //we initialised function with only string argument
        fun(1); //we initialised function with int argument in it
        fun(1, "Soumya");  //we initialised an function with a int and a string argument

    }

    static void fun(int i, String s) { //declared function with int and string argument
        System.out.println(i);
        System.out.println(s);
    }
    static void fun( String s, int i) { //declared function with only the order of parameters changed as the previous one
        System.out.println(i);
        System.out.println(s);
    }

    static void fun(int i) {        //declared function with int argument
        System.out.println(i);
    }

    static void fun(String a) {     //declared function with only string argument
        System.out.println(a);
    }

//    static void fun(String b){    //we cannot declare this function bc the arguments are same to that of the previous
//        System.out.println(b);    //even if we change the variable it will give an error
//    }                             //we need to change the order of the arguments to make compiler understand

}
