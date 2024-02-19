package solutions;

// Program to calculate Electricty bill

import java.util.Scanner;

public class EletrictyBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // constants for tariff rates
        final double RATE_UNDER_100 = 3.50;  // Rate for units under 100 kWh
        final double RATE_UNDER_300 = 6.50;  // Rate for units between 100 and 300 kWh
        final double RATE_ABOVE_300 = 7.50;  // Rate for units above 300 kWh

        // Prompt user to enter consumed units
        System.out.print("Enter consumed units (kWh): ");
        int consumedUnits = in.nextInt();

        // Calculate bill amount based on consumed units
        double billAmount;
        if (consumedUnits <= 100) {
            billAmount = consumedUnits * RATE_UNDER_100;
        } else if (consumedUnits <= 300) {
            billAmount = 100 * RATE_UNDER_100 + (consumedUnits - 100) * RATE_UNDER_300;
        } else {
            billAmount = 100 * RATE_UNDER_100 + 200 * RATE_UNDER_300 + (consumedUnits - 300) * RATE_ABOVE_300;
        }

        // Display the total bill amount
        System.out.println("Total bill amount: ₹" + billAmount);
    }
}
