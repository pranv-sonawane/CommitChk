import java.util.Locale;

public class Palindro {
    public static void main(String[] args) {
        String abc = "LmaO";
        System.out.println(isPlaindrome(abc));
    }
    static boolean isPlaindrome(String str){
        str = str.toLowerCase();
        int start = 0, end = str.length() - 1;
        while (start <= end){
            if (str.charAt(start) != str.charAt(end)){
                return false;
            }else{
                start ++;
                end --;
            }
        }
        return true;
    }
}
