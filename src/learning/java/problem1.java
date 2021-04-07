//        Write a program that calculates minutes and remaining seconds from total seconds.
//        example case:
//        input:	130sec
//        output:	2min and 10sec

package learning.java;
import java.util.Scanner;

public class problem1 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter seconds");
        int seconds = input.nextInt();
        int min = seconds / 60;
        int sec = seconds % 60;
        System.out.println(min + " minutes and " + sec + " seconds");

    }
}
