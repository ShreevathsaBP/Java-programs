package solutions;

// Q: Distance between two points

import java.util.Scanner;

public class distance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt the user to input co-ordinates at initial point
        System.out.println("Enter the co-ordinates of the initial point(CMs):");
        System.out.print("Enter x1: ");
        double x1 = in.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = in.nextDouble();

        // Prompt the user to input co-ordinates at final point
        System.out.println("Enter the co-ordinates of the final point(CMS):");
        System.out.print("Enter x2: ");
        double x2 = in.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = in.nextDouble();

        // Calculate the distance
        // formula: d=√((x2 – x1)² + (y2 – y1)²)
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Display the distance between two points
        System.out.println("Distance between the points = " + distance + "CMs");
    }
}
