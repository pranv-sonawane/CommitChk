import java.util.Arrays;

public class StringShuffle {
    public static void main(String[] args) {
        String str = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        String ans = (restoreString(str,indices));
        System.out.println(ans);
    }
    static String restoreString(String s, int[] indices) {
        char[] ans = new char[s.length()];
        for (int j = 0; j < s.length(); j++) {
            ans[indices[j]] = s.charAt(j);
        }

        return String.valueOf(ans);
    }

}

