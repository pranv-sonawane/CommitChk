public class RecursiveFn {
    public static void main(String[] args) {
        print1(1);
    }

    static void print1(int n) {

        if (n == 5) {                   // This statement breaks the infinite loop i.e the function calling itself
            System.out.println(n);      // This is also called as base condition
            return;                     // its is a condition where our recursion will stop making new calls
        }

        System.out.println(n);
        print1(n + 1);              // This function is calling itself in its own body
                                        // So this is a recursive function
    }
}