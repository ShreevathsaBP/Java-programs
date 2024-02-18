package solutions;

import java.util.Scanner;

// Java Program Vowel Or Consonant without using a method
public class Vowel_const {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // take input from the user
        System.out.print("Enter a alphabet: ");
        char alpha = in.next().charAt(0);

        // check if it is a vowel
        if ((alpha >= 'a' && alpha <= 'z') || (alpha >= 'A' && alpha <= 'Z')) {
            if (alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u' ||
                    alpha == 'A' || alpha == 'E' || alpha == 'I' || alpha == 'O' || alpha == 'U') {
                System.out.println(alpha + " is a vowel.");
            } else {
                System.out.println(alpha + " is a consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid character.");
        }
    }
}
