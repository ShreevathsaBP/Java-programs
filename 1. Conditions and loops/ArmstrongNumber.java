package solutions;

import java.util.Scanner;

// Armstrong Number In Java without using methods
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = in.nextInt();

        int originalNumber = number;
        int numberOfDigits = 0;
        int armstrongCheck = 0;

        // Count number of digits
        while (originalNumber != 0) {
            originalNumber /= 10;
            numberOfDigits++;
        }

        originalNumber = number;

        // Calculate Armstrong number
        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            armstrongCheck += (int) Math.pow(remainder, numberOfDigits);
            originalNumber /= 10;
        }

        if (armstrongCheck == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

    }
}
