package solutions;

import java.util.Scanner;

// Find if a number is palindrome or not without using any methods
public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Take a number as input
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        // checking for palindrome
        int originalnum = num;
        int reversednum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversednum = reversednum * 10 + digit;
            num /= 10;
        }

        // displaying the output
        if (originalnum == reversednum) {
            System.out.println(originalnum + " is a palindrome");
        } else {
            System.out.println(originalnum + " is not a palindrome");
        }
    }
}
