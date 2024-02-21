package functions;

import java.util.Scanner;

// Q: Define a method to find out if a number is prime or not.
public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = in.nextInt();
        if (isprime(num)) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }

    private static boolean isprime(int num) {
        if (num <= 1) {
            return false;
        } else if (num <= 3) {
            return true;
        } else if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        int i = 5;
        while (i * i <= num) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }
        return true;
    }
}
