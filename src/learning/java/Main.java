package learning.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please type your age:");

        int userAge = input.nextInt();

        System.out.println("User Age: " + userAge);

    }
}

