package solutions;

import java.util.Scanner;

// Q: Calculate batting average in cricket
public class BattingAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt for name of the batter
        System.out.print("Enter the name of the Batter: ");
        String name = in.nextLine();

        // Prompt the user for number of runs scored by the batsman
        System.out.print("Enter the total number of runs scored by the batter: ");
        int runs = in.nextInt();

        // prompt the user for number of time the batter has been out
        System.out.print("Enter the total number of times the batter has been caught out: ");
        int out = in.nextInt();

        // calculate batting average
        float Batting_average = (float) runs / out;

        // Display the batting average
        System.out.println("Batting average of " + name + " is = " + Batting_average);
    }
}
