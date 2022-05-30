package com.pranav;

public class countEvenDigitNumsInArr {
    public static void main(String[] args) {
        int[] arr = {1, 22, 9, 654, 1236};
        System.out.println(countEvenDigitNumbers(arr));
    }
    static int countEvenDigitNumbers(int[] a){
        int count = 0;
        for (int every : a){
            if (even(every)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int i) {
        int count = countdigits(i);
        return count % 2 == 0;
    }
    static int countdigits(int n){
        //corner case if a number is negative
        if (n < 0){
            n = n * -1;     //multiply it with -1
        }
//        //if number is 0 then return 1 as the compiler will return 0 itself
//        if (n == 0){
//            return 1;
//        }
//        int count = 0;
//        while (n>0){
//            count++;
//            n = n / 10;
//        }
//        return count;

        //we can also use a Math Library function which is
        return (int) (Math.log10(n)) +1;     //this will be taught by kunal in some another lecture called number system
    }
}
