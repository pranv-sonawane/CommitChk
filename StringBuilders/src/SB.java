public class SB {
    public static void main(String[] args) {
         StringBuilder str = new StringBuilder();       // In the StringBuilder we can append just the
            // new character to the same object in the String
            // IMP : The StringBuilder is an Datatype for String that is *Mutable****
            // Hence new object is not being created, We're modifying in the same Object in the heap
            // This approach saves the space and the time consumed in the heap memory and the StringPool
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            str.append(ch);
        }

        System.out.println(str);
        System.out.println(str.reverse());
        System.out.println(str.deleteCharAt(0));    // deleted the first index of the reversed string
    }
}
