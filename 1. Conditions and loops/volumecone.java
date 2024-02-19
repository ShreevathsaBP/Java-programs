package com.abc;

import java.util.Scanner;

public class volumecone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //take input base and height
        System.out.print("Enter the radius of the cone: ");
        double radius = in.nextDouble();
        System.out.print("Enter the height of the cone: ");
        double height = in.nextDouble();

        //calculate volume of the cone
        double volume =  3.142/ 3 * radius * radius * height;

        //display volume
        System.out.println("volume of the cone is " + volume + " cubic units ");
        }
    }

