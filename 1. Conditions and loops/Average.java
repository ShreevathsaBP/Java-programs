package solutions;

import java.util.Scanner;

// Q: to calculate average of N numbers
public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt user to enter the number of elements
        System.out.print("Enter the number of elements: ");
        int N = in.nextInt();

        // Check if the number of elements is valid
        if (N <= 0) {
            System.out.println("Please enter a valid number of elements");
            return;
        }

        // Prompt user to enter the numbers
        System.out.print("Enter the " + N + " numbers: ");
        int sum = 0;
        for (int i = 0; i < N; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = in.nextInt();
            sum += num;
        }

        // Calculate the average
        double average = (double) sum / N;

        // Display the average
        System.out.println("Average of the " + N + " numbers= " + average);
    }
}
