package learning.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter year:");
        int year = input.nextInt();
        int i = year % 12;
        String response;
        response = "";
        switch(i){
            case 0 : response = "monkey"; break;
            case 1 : response = "rooster"; break;
            case 2 : response = "dog"; break;
            case 3 : response = "pig"; break;
            case 4 : response = "rat"; break;
            case 5 : response = "ox"; break;
            case 6 : response = "tiger"; break;
            case 7 : response = "rabbit"; break;
            case 8 : response = "dragon"; break;
            case 9 : response = "snake"; break;
            case 10 : response = "horse"; break;
            case 11 : response = "sheep"; break;
        }
        System.out.println("Your Chinese Zodiac sign is a " + response + "!");
    }
}




