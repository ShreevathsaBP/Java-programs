package functions;

import java.util.Scanner;

// Q: Define a method that returns the product of two numbers entered by user.
public class Product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Prompt the user to input the numbers
        System.out.println("Enter first number:");
        int num1 = in.nextInt();

        System.out.println("Enter second number:");
        int num2 = in.nextInt();

        // using method
        int product = caluclateproduct(num1, num2);

        // Display the result
        System.out.println("Product = " + product);

    }

    public static int caluclateproduct(int x, int y) {
        return x * y;
    }
}
