package com.abc;

import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("what is your name?");
        String name = input.nextLine();
        System.out.println("hello, " + name);
    }
}
