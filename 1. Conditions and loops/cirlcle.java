package com.abc;

import java.util.Scanner;

public class cirlcle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         //take radius as input
        System.out.print("Enter the radius of the circle: ");
        float r = in.nextFloat();

        //calculate area of the circle
        double area =  (3.142 * r * r);

        //display area
        System.out.println("Area of the circle is " + area);
    }
}
