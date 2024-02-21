package functions;

import java.util.Scanner;

// Q: Write a program to print the factorial of a number by defining a method named 'Factorial'.
public class Factorial_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Taking input
        System.out.println("Enter a number: ");
        int num = in.nextInt();

        // calculating factorial
        int fact = 1;
        fact = factorial(num);

        // display factorial
        System.out.println("Factorial of " + num + " is " + fact);

    }

    private static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return(n * factorial(n -1));
    }
}
