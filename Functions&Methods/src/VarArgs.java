import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,"Pranav", "Soumya");  // we can give as many inputs as we need
    }

    static void fun(int a, String ...v) { // the ...v is a Variable length argument. we can input as many string type inputs as we want
        System.out.println(Arrays.toString(v)); //the ...v is internally declared as an array with String datatype
        System.out.println(a);
    }
}
