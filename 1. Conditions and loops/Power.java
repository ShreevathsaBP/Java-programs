package solutions;

// Q: Calculate The power without using any in-built methods

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt for base
        System.out.print("Enter the base: ");
        double base = in.nextDouble();

        // Prompt for exponent
        System.out.print("Enter the exponent: ");
        int exponent = in.nextInt();

        // Calculate result
        double result = 1;
        for (int i = 0; i < Math.abs(exponent); i++) {
            result *= base;
        }

        // check if the original exponent is negative
        if (exponent < 0) {
            result = 1 / result;
        }

        // Display the power
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}
