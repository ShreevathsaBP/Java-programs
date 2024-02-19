package functions;

import java.util.Scanner;

/* Q: Write a program to print the circumference and area of a circle of radius entered by user by defining
 your own method.
 */
public class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // prompt the user to input radius
        System.out.println("Enter the radius of the circle:");
        int r = in.nextInt();

        // calculation
        double Circumference = calculatecircumference(r);
        double Area = calculatearea(r);

        // Display the result
        System.out.println("Circumference of the circle is "+ String.format("%.2f", Circumference));
        System.out.println("Area of the circle is " + String.format("%.2f", Area));

    }

    // Java method to calculate circumference of the circle
    public static double calculatecircumference(double a) {
        double circum = 2 * Math.PI * a;
        return circum;
    }

    public static double calculatearea(double b) {
        double area = Math.PI * b * b;
        return area;
    }

}
