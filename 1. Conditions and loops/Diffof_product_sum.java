package com.abc;

import java.util.Scanner;

public class Diffof_product_sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = in.nextInt();
        int difference = calculateDifference(number);

        System.out.println("Difference between product and sum of digits: " + difference);
    }

    public static int calculateDifference(int n) {
        int product = 1;
        int sum = 0;

        // Loop through each digit
        while (n > 0) {
            int digit = n % 10;
            product *= digit;
            sum += digit;
            n /= 10;
        }

        return product - sum;
    }
}
