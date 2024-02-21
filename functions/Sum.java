package functions;

import java.util.Scanner;

// Q: Write a function that returns the sum of first n natural numbers.
public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = in.nextInt();

        System.out.println(findsum(n));
    }

    public static int findsum(int n) {
        int sum = 0;
        for (int x = 1; x <= n; x++)
            sum = sum + x;
        return sum;
    }
}
