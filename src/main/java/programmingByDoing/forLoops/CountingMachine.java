/**
 * Write a program that gets an integer from the user. Count from 0 to that number. Use a for loop to do it.
 */
package programmingByDoing.forLoops;

import java.util.Scanner;

public class CountingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to count to: ");
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}