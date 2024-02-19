package solutions;

import java.util.Scanner;

public class Factorial {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int num = in.nextInt();

        if (num < 0) {
            System.out.println("Error: Please enter a non-negative integer.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + num + " is: " + factorial);
        }

    }
}
