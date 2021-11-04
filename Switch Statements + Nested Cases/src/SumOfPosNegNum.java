import java.util.Scanner;

public class SumOfPosNegNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num;
        int pos = 0, neg = 0, posOdd = 0;
        System.out.println("The output will print when user enters zero ");
        System.out.println("Enter the numbers in integers : ");

        while (true){
            num = in.nextInt();
            if (num > 0){
                pos += num;
                if(num % 2 != 0){
                    posOdd += num;
                }
            }
            if (num < 0){
                neg += num;
            }
            if (num == 0){
                break;
            }
        }
            System.out.println("sum of positive numbers entered "+pos);
            System.out.println("sum of negative numbers entered is "+neg);
            System.out.println("sum of positive odd numbers is "+posOdd);

    }
}
