package solutions;

import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //input a number
        System.out.print("Enter a number:");
        int num = in.nextInt();

        System.out.println("Factors of " + num + " are : ");
        for (int i =1; i<=num; i++){
            if(num % i == 0){
                System.out.println(i);
            }
        }
    }
}
