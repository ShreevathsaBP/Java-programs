package solutions;

import java.util.Scanner;

// Q: Calculate discount of a product
public class Discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt user to enter the original price and discount percentage
        System.out.print("Enter the original price of the product(in ₹): ");
        double originalPrice = in.nextDouble();

        System.out.print("Enter the discount percentage (e.g., 10 for 10%): ");
        double discountPercentage = in.nextDouble();

        // Check if the discount percentage is valid
        if (discountPercentage < 0 || discountPercentage > 100) {
            System.out.println("Invalid discount percentage. Please enter a value between 0 and 100.");
            return;
        }

        // Calculate the discount amount
        double discountAmount = (originalPrice * discountPercentage) / 100;

        // Calculate the discounted price
        double discountedPrice = originalPrice - discountAmount;

        // Display the discount amount and discounted price
        System.out.println("Original price: ₹" + originalPrice);
        System.out.println("Discount amount: ₹" + discountAmount);
        System.out.println("Discounted price: ₹" + discountedPrice);

    }
}
