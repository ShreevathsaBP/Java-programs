package com.abc;

import java.util.Scanner;

public class Simpleintrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principle amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter the time duration in years: ");
        double time = input.nextDouble();
        System.out.print("Enter the rate of intrest: ");
        double rate = input.nextDouble();

        double simpleintrest = (amount * time * rate)/100;
        System.out.println("Simpleintrest = " + simpleintrest);
    }
}
