package functions;

// Q: Write a Program to find the Maximum and Minimum of the Given Three Numbers.

import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.print("Please enter first number : ");
        int first = scanner.nextInt();

        System.out.print("Please enter second number : ");
        int second = scanner.nextInt();

        System.out.print("Please enter third number : ");
        int third = scanner.nextInt();

        int largest = largest(first, second, third);
        int smallest = smallest(first, second, third);

        System.out.printf("largest of three numbers %d, %d, and %d is : %d %n", first, second, third, largest);
        System.out.printf("smallest of three numbers %d, %d, and %d is : %d %n", first, second, third, smallest);
    }

    // Java method to calculate largest of three numbers
    public static int largest(int first, int second, int third) {
        int max = first;
        if (second > max) {
            max = second;
        }

        if (third > max) {
            max = third;
        }

        return max;
    }

    // Java method to calculate smallest of three numbers
    public static int smallest(int first, int second, int third) {
        int min = first;
        if (second < min) {
            min = second;
        }

        if (third < min) {
            min = third;
        }

        return min;
    }
}

