package com.pranav;

public class HourFormatTo24 {
    public static void main(String[] args) {
        String str = "07:23:00PM";
        convertTo24(str);
    }

    static void convertTo24(String str) {
        //finding hours
        int h2 = (int) str.charAt(1) - '0';
        int h1 = (int) str.charAt(0) - '0';
        int hh = (h1 * 10 + h2 % 10);

        //if AM
        if (str.charAt(8) == 'A'){
            if (hh == 12){
                System.out.println("00");
                for (int i = 2; i <= 7; i++) {
                    System.out.print(str.charAt(i));
                }
            }
            else
                for (int i = 0; i <= 7; i++) {
                    System.out.print(str.charAt(i));
                }
        }
        //if PM
        else  {
            if (hh == 12){
                System.out.println("12");
                for (int i = 2; i <= 7; i++) {
                    System.out.print(str.charAt(i));
                }
            }
            else {
                hh = hh + 12;
                System.out.print(hh);
                for (int i = 2; i <= 7; i++) {
                    System.out.print(str.charAt(i));
                }
            }
        }
    }

}
