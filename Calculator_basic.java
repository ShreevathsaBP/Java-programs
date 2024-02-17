package com.abc;

import java.util.Scanner;

public class Calculator_basic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 = input.nextInt();
        System.out.println("Enter second number: ");
        int n2 = input.nextInt();

        System.out.print("Enter an operator(+,-,*,/) : ");
        char op = input.next().charAt(0);

        double result = 0;

        if (op == '+' ) {
            result = n1 + n2;
        } else if (op == '-') {
            result = n1 -n2;
        } else if (op == '*') {
            result = n1 * n2;
        } else if (op == '/') {
            if(n2 == 0){
                System.out.println("Denominator cannot be zero");
                return;
            }else {
                result = (float)n1/n2;
            }
        }else {
            System.out.println("Invalid operator");
            return;
        }

        System.out.println("result = " + result);
    }
}
