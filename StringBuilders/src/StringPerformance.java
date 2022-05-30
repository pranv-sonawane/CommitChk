public class StringPerformance {
    public static void main(String[] args) {
        String ans = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);      // As we know the Strings in java are immutable
            // So every time we append the new character a new object
            // lots of objects don't have reference

            // 1. This method is very inefficient because Strings are immutable & java created new string
            // copying the
            // old string and then adding a the new character to that string
            // object everytime we append
            // the new character and this consumes much more memory
            // 2. This takes very much time because everytime it has to create the new object in the heap
            // and the time complexity of this code is On^2  i.e. (n(n+1))/2
            ans = ans + ch;
        }
        System.out.println(ans);
    }

    // Wouldn't it be great if we had an datatype that would allow us to make changes
    // in the same object only ?
    // SO we have StringBuilder !!
}
