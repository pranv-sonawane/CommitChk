import com.pranav.Concat;

import java.util.Arrays;
import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
//        int[] arr = {3, 1, 2, 10, 1};
//        System.out.println(Arrays.toString(runningSum(arr)));

    }
   static int[] runningSum(int[] a){
       int prev = 0;
       int[] sum = new int[a.length];
       for (int i = 0; i < a.length; i++) {
           prev += a[i];
           sum[i] = prev;
       }
       return sum;

   }

   static void isfrequency(int[] a){
        int visited = -1, d, count;
        int[] s = new int[a.length];
       for (int i = 0; i < a.length; i++) {
           count = 1;   //lets assume every element is unique and has occured atleast Once
           for (int j = i + 1; j < a.length; j++) {
               if (a[i] == a[j]){
                   count++;
                   s[j] = visited;
               }
           }
           if (s[i] != visited){
               s[i] = count;
           }
       }
   }
}
