package functions;

import java.util.Scanner;

/* Q: Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display
 grades according to the marks entered as below:
 Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail
 */
public class Grades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt the user to enter the marks
        System.out.println("Enter the marks(out of 100): ");
        int marks = in.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks entered. Marks should be between 0 and 100.");
        } else {
            displayGrade(marks);
        }
    }

    public static void displayGrade(int marks) {
        char grade;
        if (marks >= 91 && marks <= 100) {
            grade = 'A';
        } else if (marks >= 81 && marks <= 90) {
            grade = 'B';
        } else if (marks >= 71 && marks <= 80) {
            grade = 'C';
        } else if (marks >= 61 && marks <= 70) {
            grade = 'D';
        } else if (marks >= 51 && marks <= 60) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        switch (grade) {
            case 'A':
                System.out.println("Grade: AA");
                break;
            case 'B':
                System.out.println("Grade: AB");
                break;
            case 'C':
                System.out.println("Grade: BB");
                break;
            case 'D':
                System.out.println("Grade: BC");
                break;
            case 'E':
                System.out.println("Grade: CD");
                break;
            default:
                System.out.println("Grade: Fail");
                break;
        }
    }
}
