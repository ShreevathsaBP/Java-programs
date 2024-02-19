package com.abc;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //take input base and height
        System.out.print("Enter the base of the triangle : ");
        double base = in.nextDouble();
        System.out.print("Enter the height of the triangle : ");
        double height = in.nextDouble();

        // calculate area
        double area = 0.5 * base * height;

        //display area
        System.out.println("Area of the triangle is " + area);
    }
}
