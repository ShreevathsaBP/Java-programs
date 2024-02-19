package com.abc;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double n1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        double n2 = input.nextDouble();

        double largest = 0;

        if(n1==n2){
            System.out.println("Both numbers are equal");
            return;
        } else if (n1 > n2) {
            largest =  n1;
        } else{
            largest = n2;
        }

        System.out.println("Largest number is " + largest);
    }
}
