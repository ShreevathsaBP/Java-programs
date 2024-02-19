package solutions;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int num;

        System.out.println("Enter the integers (enter 0 to exit)");

        while (true){
            System.out.print("Enter a number: ");
            num = in.nextInt();

            if (num == 0){
                break;
            }
            sum += num;
        }
        System.out.println("Sum of all the numbers is = " + sum);
    }
}
