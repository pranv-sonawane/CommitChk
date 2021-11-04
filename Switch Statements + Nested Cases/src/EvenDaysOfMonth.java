import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class EvenDaysOfMonth {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int evendays = 0;
        int daysinmonth = in.nextInt();
        for (int i = 1; i <= daysinmonth; i++) {
            if (daysinmonth % i == 0){
                evendays ++;
            }
        }
        System.out.println(evendays);
    }
}
