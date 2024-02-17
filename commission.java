package solutions;

// Q: Calculate Commission Percentage

import java.util.Scanner;

public class commission {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Prompt for Total sales revenue
        System.out.print("Enter the total sales revenue in ₹: ");
        float TSR = in.nextFloat();

        // prompt for commission rate
        System.out.print("Enter the commission amount in ₹: ");
        float Commission_amount = in.nextFloat();

        // Calculate commission
        // commission = total sales revenue * commission rate.
        float Commission_rate = (Commission_amount / TSR) * 100;

        // display commission percentage
        System.out.println("Commission percentage = " + Commission_rate + "%");

    }
}
