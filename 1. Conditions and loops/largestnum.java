package solutions;

import java.util.Scanner;

public class largestnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int largest = Integer.MIN_VALUE; // Initialize largest to the smallest possible integer value

        System.out.println("Enter integers (enter 0 to exit)");

        while (true) {
            System.out.print("Enter a number: ");
            int num = in.nextInt();

            if (num == 0) {
                break; // Exit the loop if the user enters 0
            }

            if (num > largest) {
                largest = num; // Update largest if the entered number is larger
            }
        }

        if (largest != Integer.MIN_VALUE) {
            System.out.println("Largest number entered: " + largest);
        } else {
            System.out.println("No numbers were entered.");
        }
    }
}
