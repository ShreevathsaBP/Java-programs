package functions;


import java.util.Scanner;

// Q: Write a function to find if a number is a palindrome or not. Take number as parameter.
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = in.nextInt();

        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }

    private static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int originalNumber = number;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }
}
