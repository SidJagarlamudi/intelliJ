//          Create a Scanner object;
//          Write a prompt to the console;
//          Use Scanner’s method nextDouble() to read a value of datatype double from the console.

package learning.java;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a double value");
        double d = input.nextDouble();
        System.out.println(d);
    }
}
