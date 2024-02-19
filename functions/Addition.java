package functions;

import java.util.Scanner;

// Q: Write a program to print the sum of two numbers entered by user by defining your own method.
public class Addition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt the user to input two numbers
        System.out.print("Enter 1st number: ");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = in.nextInt();

        // using method
        int sum = add(num1, num2);

        // Display the sum
        System.out.println("sum = " + sum);
    }

    // Java method to add two numbers
    public static int add(int x, int y) {
        return x + y;
    }
}
