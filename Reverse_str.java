package solutions;

import java.util.Scanner;

// Reverse A String In Java without using methods
 public class Reverse_str{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = in.nextLine();

        // Reversing the string
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Display reversed string
        System.out.println("Reversed string: " + reversed);

        in.close();
    }
}

