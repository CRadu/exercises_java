/**
 * Write a program that gets an integer from the user. Add up all the numbers from 1 to that number, and display the total. Use a for loop to do it.
 * <p>
 * You have done something like this before.
 */
package programmingByDoing.forLoops;

import java.util.Scanner;

public class AddingValuesWithAForLoop {
    public static void main(String[] args) {
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to count to: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            total = total + i;
        }
        System.out.println("\nTotal is: " + total);
    }
}