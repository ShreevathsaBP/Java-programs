package solutions;

import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter num1: ");
        double num1 = in.nextDouble();
        System.out.print("Enter num2: ");
        double num2 = in.nextDouble();

        double sum = 0;
        sum = num1 + num2;
        System.out.print("Sum = " + sum);
    }
}
