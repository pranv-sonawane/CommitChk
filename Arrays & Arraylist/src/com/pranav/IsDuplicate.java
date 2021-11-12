package com.pranav;

public class IsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3};
        isDuplicate(arr);
    }
    static void isDuplicate(int[] a){
        int dup = 0, count, visited  = -1;
        int [] farr = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            count = 1;          // each element has occured atLEAST ONCE
            for (int j = i + 1; j < a.length; j++) {
                dup = a[i];
                if (a[j] == dup){
                    count ++;
                    //to avoid counting same elements again && when the counter starts again the count is set to 1 again
                    farr[j] = visited;
                }
            }
            if (farr[i] != visited)
                farr[i] = count;
        }
        int[] lucky = new int[farr.length];
        for (int i = 0; i < farr.length; i++) {
            if (a[i] == farr[i])
                lucky[i] = a[i];
        }
        int ans = 0;
        for (int i = 0; i < lucky.length; i++) {
            if (lucky[i] > ans)
                ans = lucky[i] ;
       }
        System.out.println(ans);
    }
}
