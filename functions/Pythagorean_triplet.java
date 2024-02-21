package functions;

import java.util.Scanner;

/* Q: Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the
 sum of the square of two numbers is equal to the square of the third number).
 */
public class Pythagorean_triplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();

        CheckPythagoreantriplet(n1, n2, n3);

        if (CheckPythagoreantriplet(n1, n2, n3) == true) {
            System.out.println("The given set of numbers are pythagorean triplet");
        } else {
            System.out.println("The give set of numbers are not a pythagorean triplet");
        }
    }

    private static Boolean CheckPythagoreantriplet(int n1, int n2, int n3) {
        return Math.pow(n1, 2) + Math.pow(n2, 2) == Math.pow(n3, 2) || Math.pow(n2, 2) + Math.pow(n3, 2) == Math.pow(n1, 2) || Math.pow(n1, 2) + Math.pow(n3, 2) == Math.pow(n2, 2);
    }
}
