package functions;

import java.util.Scanner;

// Q: Write a function that returns all prime numbers between two given numbers.
public class Primenumbers_interval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Ask user to enter lower value of interval
        System.out.println("Enter lower bound of the interval: ");
        int lower = in.nextInt(); // Take input

        // Ask user to enter upper value of interval
        System.out.println("Enter upper bound of the interval: ");
        int upper = in.nextInt(); // Take input

        // Print display message
        System.out.println("Prime numbers between " + lower + " and " + upper + " are :");

        for (int i = lower; i <= upper; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        // 0 and 1 are neither prime nor composite numbers
        if (n == 0 || n == 1) {
            return false;
        }
        // 2 is a prime number
        if (n == 2) {
            return true;
        }
        // every composite number has a prime factor
        // less than or equal to its square root.
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
