package Expressions;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = input.nextInt();

        System.out.println("Enter the second number: ");
        int b = input.nextInt();

//        int greaterNum;
//        if (a > b) {
//           greaterNum = a;
//        } else {
//            greaterNum = b;
//        }


        // Ternary Operator
        // Condition ? True : False
        int greaterNum = a > b ? a : b;
        System.out.println("The greater number is: " + greaterNum);
    }
}
