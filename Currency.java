package com.abc;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Currecncy in rupees(₹): ");
        float rupees = input.nextFloat();

        float dollars = rupees*0.012f;
        System.out.println("₹" +rupees + " = $" + dollars);

    }
}
