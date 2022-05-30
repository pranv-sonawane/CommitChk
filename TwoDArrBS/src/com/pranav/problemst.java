package com.pranav;

import java.util.Scanner;

public class problemst {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean exit = true;
        while (exit){
            System.out.print("Enter a : ");
            int x = in.nextInt();
            System.out.print("Enter b : ");
            int y = in.nextInt();
            exit = problemm(x, y);
        }

    }
    static boolean problemm(int a, int b){
        Scanner in = new Scanner(System.in);
        char op = 0;
        int temp1;
        while (op != 'N' && op != 'n'){
            System.out.print("Enter an Operation to perform: ");
            op = in.next().charAt(0);
            switch (op){
                case '+':
                    System.out.print("The addition is : ");
                    temp1 = (a + b);
                    System.out.println(temp1);
                    break;
                case '-':
                    System.out.print("The substraction is : ");
                    temp1 = (a - b);
                    System.out.println(temp1);
                    break;
                case '*':
                    System.out.print("The multiplication is : ");
                    temp1 = a * b;
                    System.out.println(temp1);
                    break;
                case '/':
                    System.out.print("The division is : ");
                    temp1 = a / b;
                    System.out.println(temp1);
                    break;
                case 'n':
                    return false;

                default:
                    System.out.println("Enter Correct Operator (+, -, *, /) ! ");

            }
            System.out.println("Do another operation(Y/N)? ");
            char temp = in.next().charAt(0);
            if (temp == 'n' || temp == 'N'){
                return false;
            }
            else if (temp == 'y' || temp == 'Y'){
                System.out.println("Okay!");
                return true;
            }
            else {
                System.out.println("Invalid choice!!");
            }
        }
        return true;
    }
}
