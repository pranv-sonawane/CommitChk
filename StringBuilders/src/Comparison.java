import java.util.SplittableRandom;

public class Comparison {
    public static void main(String[] args) {

        //String pool is a pool of strings java makes to optimize the memory and the code
        // so if two objects are of same value and we use the comparison operator we can see that
        // both the variables are pointing to the same object in the heap-string pool

        // here a object is created and both the variables point to the same object in the String Pool
        String name1 = "Chinu";
        String name2 = "Chinu";

        // The == comparison operator will give TRUE because both the objects are pointing to the same
        //object in the string pool
        System.out.println(name1 ==  name2);


        // Here we are creating two seperate distinct new objects outside of the StringPool
        String a = new String("Pranav");
        String b = new String("Pranav");

        // This will give false because the above two objects are distinct
        System.out.println(a == b);

        // To check if only the values are same we should use the method .equals
        // The method does not care about if its the same object or not it will just check if the values are
        // equal or not, while on the other hand the == operator checks if the given variable is pointing the
        // same object in stringpool or not

        System.out.println(a.equals(b));

    }
}
