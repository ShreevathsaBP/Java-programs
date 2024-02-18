package solutions;

// Q: Calculate CGPA java program

import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt the user for number of semesters
        System.out.print("Enter the toal number of semesters you had: ");
        int sem = in.nextInt();

        // Ask for the percentage of individual semesters
        System.out.println("Enter the percentage of each semesters respectively(For eg. 95 for 95%):");
        float totalpercentage = 0;
        for (int i = 0; i < sem; i++) {
            System.out.print("Semester " + (i + 1) + " percentage: ");
            float percentage = in.nextFloat();
            totalpercentage += percentage;
        }

        // calculate CGPA
        float cgpa = (float) ((totalpercentage / sem) / 9.5);

        // Display the cgpa
        System.out.println("CGPA = " + String.format("%.2f", cgpa));
    }
}
